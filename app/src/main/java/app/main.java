<<<<<<< HEAD
package app;

import classes.*;
import java.io.*;
import java.net.*;

public class Main {

			
	public static void main(String[] args) {
		try {
			ServerSocket foo = new ServerSocket(8080);
=======
package portAcad;
import java.io.*;
import java.net.*;

public class main {
	public static void main(String[] args) {
    	try {
        	ServerSocket foo = new ServerSocket(4040);
>>>>>>> becf7958617c6fe23940ca8632ef2c8617148635
			Socket bar = foo.accept(); // connects
			DataInputStream getter = new DataInputStream(bar.getInputStream());
			InputStreamReader bra = new InputStreamReader(bar.getInputStream());
            BufferedReader br =  new BufferedReader(bra);
		
		

<<<<<<< HEAD
			String foobar = (String) getter.readUTF();
			Disciplina d1 = new Disciplina("matemática", 60);
			Estudante e1 = new Estudante("12", "Lucas", "341325");
			Professor p1 = new Professor("123", "felipe", "314981235", d1);
			ConjuntoNotas cn1 = new ConjuntoNotas(e1, d1, 10, 4);		

			String linha = br.readLine();
			System.out.println(linha);
			br.close();
			getter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
=======
            String foobar = (String) getter.readUTF();

            getter.close();
		} catch(Exception e){System.out.println(e);}
>>>>>>> becf7958617c6fe23940ca8632ef2c8617148635

	}

}
