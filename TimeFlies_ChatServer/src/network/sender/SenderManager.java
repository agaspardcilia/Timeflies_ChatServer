package network.sender;

import java.util.ArrayList;

import core.channel.Channel;

/**
* @author alexandre
* SenderManager.java
*/
public class SenderManager {
	private final static int MAX_CHAN_PER_SENDER = 5;
	
	private ArrayList<Sender> senders;
	
	public SenderManager() {
		senders = new ArrayList<Sender>();
		senders.add(new Sender());
	}
	
	public void addChannel(Channel c) {
		Sender crt;
		
		for (int i = 0; i < senders.size(); i++) {
			crt = senders.get(i);
			if(crt.getChannelCount() < MAX_CHAN_PER_SENDER) {
				crt.addChannel(c);
				return;
			}
		}
		
		//When there's no enough space in all the senders
		crt = new Sender();
		senders.add(crt);
		crt.addChannel(c);
		
	}

	
}

