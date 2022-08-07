<<<<<<< HEAD
package app;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class webServer {
	public static void main(String[] args) {
       
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Startando in 127.0.0.1:80");
            Socket client = server.accept();
            System.out.println("Startado: ggwp");
        }catch (Exception e) {
			System.out.println(e);
		}
=======
package portAcad;
import portAcad.*;

import java.net.*;
import java.io.*;
import java.util.concurrent.*; //for Callable
import java.util.concurrent.ExecutorService;
import java.util.Date;


class webServer implements Callable<Void> {
    private Socket connection;

    webServer(Socket connection) {
        this.connection = connection;
>>>>>>> becf7958617c6fe23940ca8632ef2c8617148635
    }

    //@Override
    public Void call() {
        try {
            Writer out = new OutputStreamWriter(connection.getOutputStream());
            Date now = new Date();
            out.write(now.toString() + "\r\n");
            out.flush();

        } catch (IOException ex) {
            System.err.println(ex);
         } finally {
            try {
                connection.close();
            } catch (IOException e) {}
         }

        return null;
    }

}
