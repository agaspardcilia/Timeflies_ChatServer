package network.sender;

import java.util.ArrayList;

import core.channel.Channel;

/**
* @author alexandre
* Sender.java
*/
public class Sender implements Runnable{
	private ArrayList<Channel> chans;
	private boolean asleep;
	
	public Sender() {
		chans = new ArrayList<Channel>();
		asleep = false;
	}
	
	public void addChannel(Channel c) {
		chans.add(c);
	}
	
	public Channel popChannel() {
		return chans.remove(0);
	}
	
	public int getChannelCount() {
		return chans.size();
	}
	
	@Override
	public void run() {
		
	}

}
