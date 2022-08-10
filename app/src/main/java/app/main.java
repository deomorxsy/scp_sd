
package portAcad;
import portAcad.*;

import java.net.Socket;
import java.net.Socket.*;
import java.net.ServerSocket;
import java.net.URLConnection;
import javax.net.ssl.*;
import java.io.*;
import java.util.concurrent.*;
// Get host ip
import java.net.DatagramSocket;
import java.net.InetAddress;


public class main  {
	public final static int PORT = 8080;
	//public static final String HOST = "192.168.0.3";  // change to current machine IP
	public final static int numThreadsToSpawn = 10;
    public static void main(String[] args) throws IOException {
        // Replace with suitable executor
        ExecutorService pool = Executors.newFixedThreadPool(numThreadsToSpawn); //10

    // get host ip
        try(final DatagramSocket socketUDP = new DatagramSocket()) {
          socketUDP.connect(InetAddress.getByName("8.8.8.8"), 10002);
          String host = socketUDP.getLocalAddress().getHostAddress().toString();
        }  catch (IOException e) {
                // Handle exception
                System.err.println("/// Couldn't get machine ip.");

            }



		/// Implements SSL tunnel for the previous ServerSocket, check git history or commented code.
		/// One of the  main differences between javax.net.SSL.SSLSocketFactory (subclass of java.netSocket) is that it uses a method instead of a constructor to create a socket.
		SSLSocketFactory factory
		 = (SSLSocketFactory) SSLSocketFactory.getDefault();

		//SSLSocketFactory socketSSL = null;


        ServerSocket serverSocket = new ServerSocket(PORT); //8080
        System.out.println("\n========= SUBINDO NOVA THREAD =========\n");
		System.out.println("Startando in 127.0.0.1:8080 ///\n|=> Listening for connection...\n");

        while (true) {
            final Socket serverSocket = serverSocket.accept();
			//SSLSocket socketSSL = factory.createSocket("192.168.0.3", PORT);
            pool.execute(new Runnable() {

                public void run() { // it seems run can't throws IOException. For that, call() is used
					try {
                        handleSocket(serverSocket, numThreadsToSpawn); // 10 (default) Threads to Spawn
                    } catch (IOException e) {
                        // Handle exception
						System.out.println("/// Couldn't open server.");

                    }

                }

				public String handleSocket(final Socket socket, final int numThreadsToSpawn) throws IOException {
					int currentThread = numThreadsToSpawn;


                    String indexFileName = "index.html";
					System.out.println("/// Startando FixedThread [currentThread/10]......EDIT");
                    // Do stuff with your socket, same as original code
					//InputStream foo = socket.getInputStream();
                    //BufferedReader bar =  new BufferedReader(new InputStreamReader(foo, "UTF-8"));

                    //in

				   // OutputStream raw = new BufferedOutputStream(socket.getOutputStream());



					Writer out = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream(), "US-ASCII"
						)
					 ); // OK

                    //Writer out = new OutputStreamWriter(raw);

                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //works

					// PRINT REQUEST HEADER
                    String foobar = in.readLine();
                    while (!(foobar.isEmpty())){
                        System.out.println(foobar);
                        foobar = in.readLine();
                    }        //return null;

                   // Writer out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "testando output"));
                    //return null;

                     // Gets first line of header
					 StringBuilder requestLine = new StringBuilder();
					 while (true) {
					     int c = in.read();
					     if (c == '\r' || c == '\n') break;
					    requestLine.append((char) c);
					     }

                    //// from StringBuilder to String
                    String get = requestLine.toString();
					String[] tokens = get.split("\\s+"); // splits every space found in the string
					String httpVerb = tokens[0]; //http header method
					String httpVersion= ""; //http header version

					if (httpVerb.equals("GET")) {
						String fileName = tokens[1];
						if (fileName.endsWith("/")) fileName += indexFileName;
						String contentKind =
							URLConnection.getFileNameMap().getContentTypeFor(fileName);
						if (tokens.length > 2) {
							httpVersion = tokens[2];

///if(theFile.canRead()){

///}
						}
					}
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
