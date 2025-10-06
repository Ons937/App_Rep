package serverPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket socketServeur = new ServerSocket(1234);
		System.out.println("Je suis un serveur en attente la connexion d'un client");
		Socket socket = socketServeur.accept();
		System.out.println("un client est connecte");
		socket.close();

	}

}
