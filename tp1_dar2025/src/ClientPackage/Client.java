package ClientPackage;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		System.out.println("Je suis un client en attent de connectee..");
		Socket socket = new Socket("localhost", 1234);
		System.out.println("Je suis un client connecte");
		socket.close();
	}

}
