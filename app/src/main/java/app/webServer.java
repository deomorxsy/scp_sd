import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class webServer {
	public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8080);
        try {
            System.out.println("Startando in 127.0.0.1:8080 ///\n Listening for connection...");
            while (true ) {
                // 0- instance of ServerSocket opens the socket.
                /*Since HTTP is stateless, it does not need to store previous connections, so a loop is started, listening to a port, an integer passed as argument to the method, for any connection.
                  Since
                  */
                Socket clientOnSocks = server.accept();
                System.out.println("Startado: ggwp");
                // 1- read HTTP request
                // 2- generate response
                // 3- sends back a HTTP response
                // 4- close the socket
                foo = clientOnSocks.getInputStream();
                InputStreamReader bar = new InputStreamReader(foo);
                BufferedReader foobar =  new BufferedReader(bar);
                String waldo = foobar.readLine();
                while (!(waldo.isEmpty)){
                    System.out.println(waldo);
                    waldo = foobar.readLine()
                }

            }

        }
    }
}
