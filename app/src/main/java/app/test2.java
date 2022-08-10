
package portAcad;
import portAcad.*;

import java.net.Socket;
import java.net.Socket.*;
import java.net.ServerSocket;
import java.io.*;
import java.util.concurrent.*;

public class test2  {
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

					OutputStream raw = new BufferedOutputStream(socket.getOutputStream());
					 Writer out = new OutputStreamWriter(raw);
										BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //works
                    String foobar = in.readLine();
                    while (!(foobar.isEmpty())){
                        System.out.println(foobar);
                        foobar = in.readLine();
                    }        //return null;

                   // Writer out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "testando output"));
                    //return null;


					 //StringBuilder requestLine = new StringBuilder();
					 //while (true) {
					 //    int c = in.read();
					 //    if (c == '\r' || c == '\n') break;
					 //   requestLine.append((char) c);
					 //    }



					String body = new StringBuilder("<HTML>\r\n")
					 .append("<HEAD><TITLE>File Not Found</TITLE>\r\n")
					 .append("</HEAD>\r\n")
					 .append("<BODY>")
					 .append("<H1>HTTP Error 404: File Not Found</H1>\r\n")
					 .append("</BODY></HTML>\r\n").toString();
                     out.write(body);
					 //String get = requestLine.toString();




                     return null;
				}
            }); //pool.execute closing brackets
        }
    }
}
