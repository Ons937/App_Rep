package serverPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		try {
			ServerSocket socketServeur = new ServerSocket(1234);
			System.out.println("Je suis un serveur en attente la connexion d'un client");
			Socket socket = socketServeur.accept();
			System.out.println("un client est connecte");
			InputStream is = socket.getInputStream();
			int nb=is.read();
			System.out.println("la valeur reçu est: "+ nb);
			int x=nb*5;
			OutputStream os =socket.getOutputStream();
			os.write(x);
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
