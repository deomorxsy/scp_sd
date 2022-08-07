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
    }
}
