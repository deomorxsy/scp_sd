package portAcad;
import portAcad.*;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
import java.util.Date;

public class pooledServer {

    public final static int PORT = 8080;
	public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(PORT);
        System.out.println("Startando in 127.0.0.1:8080 ///\n Listening for connection...");
        while (true ) {
            // 0- instance of ServerSocket opens the socket.
            /*Since HTTP is stateless, it does not need to store previous connections, so a loop is started, listening to a port, an integer passed as argument to the method, for any connection.
              Since
              */
            try(Socket clientOnSocks = server.accept()) {
            Thread task = new webserver(connection);
            task.start();
            System.out.println("Startado: ggwp");
            //Date today = new Date();
            //String response = "HTTP/1.1 200 OKI, ACK!! \n" + today;
            //clientOnSocks.getOutputStream()
              //  .write(response.getBytes("UTF-8"));

            }  catch(IOException ex){}
            // 1- read HTTP request
            // 2- generate response
            // 3- sends back a HTTP response
            // 4- close the socket
            //foo = clientOnSocks.getInputStream();

            /*
            InputStreamReader bar = new InputStreamReader(clientOnSocks.getInputStream());
            BufferedReader foobar =  new BufferedReader(bar);
            String waldo = foobar.readLine();
            while (!(waldo.isEmpty())){
                System.out.println(waldo);
                waldo = foobar.readLine();
            } */



        }
    }
}

@Override
public void run() {
   try {
       Writer out = new OutputStreamWriter
   }
}
