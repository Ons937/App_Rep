package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.net.*;
public class Client {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		System.out.println("Je suis un client en attent de connectee..");
		Socket socket = new Socket("localhost", 1234);
		Scanner sc=new Scanner(System.in);
		OutputStream os = socket.getOutputStream();
		System.out.println("entre un entier");
		os.write(sc.nextInt());
		InputStream is = socket.getInputStream();
		int nb=is.read();
		System.out.println("la resultat est :"+nb);
		socket.close();
	}

}
