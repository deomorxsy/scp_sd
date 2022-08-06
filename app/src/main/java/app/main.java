package app;

import java.io.*;
import java.net.*;

public class Main {
	public static void main(String[] args) {
		try {
			ServerSocket foo = new ServerSocket(4040);
			Socket bar = foo.accept(); // connects
			DataInputStream getter = new DataInputStream(bar.getInputStream());

			String foobar = (String) getter.readUTF();

			getter.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
