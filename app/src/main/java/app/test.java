
package portAcad;
import portAcad.*;

import java.net.Socket;
import java.net.Socket.*;
import java.net.ServerSocket;
import java.io.*;
import java.util.concurrent.*;

public class test  {
	public final static int PORT = 8080;
	public final static int numThreadsToSpawn = 10;
    public static void main(String[] args) throws IOException {
        // Replace with suitable executor
        ExecutorService pool = Executors.newFixedThreadPool(numThreadsToSpawn); //10
        ServerSocket serverSocket = new ServerSocket(8080); //8080
		System.out.println("Startando in 127.0.0.1:8080 ///\n|=> Listening for connection...");

        while (true) {
            final Socket socket = serverSocket.accept();
            pool.execute(new Runnable() {

                public void run() { // it seems run can't throws IOException. For that, call() is used
                    try {
                        handleSocket(socket, numThreadsToSpawn);
                    } catch (IOException e) {
                        // Handle exception
						System.out.println("/// Couldn't open server.");

                    }

                }

					public String handleSocket(final Socket socket, final int numThreadsToSpawn) throws IOException {
						int currentThread = numThreadsToSpawn;
						System.out.println("/// Startando FixedThread [currentThread/10]......EDIT");
                    // Do stuff with your socket, same as original code
					//InputStream foo = socket.getInputStream();
                    //BufferedReader bar =  new BufferedReader(new InputStreamReader(foo, "UTF-8"));

                    //in
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //works
                    String foobar = in.readLine();
                    while (!(foobar.isEmpty())){
                        System.out.println(foobar);
                        foobar = in.readLine();
                    }        return null;

                   // Writer out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "hmmm acho uqe deu certo hein"));
                    //return null;

                 }
            }); //pool.execute closing brackets
        }
    }
}
