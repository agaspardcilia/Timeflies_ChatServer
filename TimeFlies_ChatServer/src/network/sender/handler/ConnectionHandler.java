package network.sender.handler;

import java.io.IOException;
import java.net.ServerSocket;

import utils.ConsoleDisplay;

/**
 * @author alexandre
 * ConnectionHandler.java
 */
public class ConnectionHandler implements Runnable{
	private final static int PORT = 6642;

	private ServerSocket servSocket;

	public ConnectionHandler() throws IOException {
		servSocket = new ServerSocket(PORT);
	}

	@Override
	public void run() {
		//TODO define end of loop condition.
		try {
			while(true) {
				servSocket.accept();
				
				
			}
		} catch (IOException e) {
			ConsoleDisplay.display_errorNotice("Something went wrong with the server socket.");
			ConsoleDisplay.printStack(e);
		}
	}


}
