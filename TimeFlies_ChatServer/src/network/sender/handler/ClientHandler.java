package network.sender.handler;

import java.net.Socket;

/**
* @author alexandre
* ClientHandler.java
*/
public class ClientHandler implements Runnable {
	private Socket clientSocket;
	
	public ClientHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
