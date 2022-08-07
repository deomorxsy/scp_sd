package app;

import classes.*;
import java.io.*;
import java.net.*;

public class Main {

			
	public static void main(String[] args) {
		try {
			ServerSocket foo = new ServerSocket(8080);
			Socket bar = foo.accept(); // connects
			DataInputStream getter = new DataInputStream(bar.getInputStream());
		

			String foobar = (String) getter.readUTF();
			Disciplina d1 = new Disciplina("matemática", 60);
			Estudante e1 = new Estudante("12", "Lucas", "341325");
			Professor p1 = new Professor("123", "felipe", "314981235", d1);
			ConjuntoNotas cn1 = new ConjuntoNotas(e1, d1, 10, 4);		
		
			
			System.out.println("teste");
			getter.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
