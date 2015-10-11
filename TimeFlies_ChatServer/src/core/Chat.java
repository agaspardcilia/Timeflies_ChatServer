package core;

import java.util.HashMap;
import java.util.HashSet;

import core.channel.Channel;
import core.messages.Message;

/**
* @author alexandre
* Chat.java
*/
public class Chat {
	private HashMap<Integer, Channel> channels;
	
	public Chat() {
		channels = new HashMap<Integer, Channel>();
	}
	
	public boolean handleMessage(Message m) {
		try {
			return getChannel(m.getDestination()).addMessage(m);
		} catch (NullPointerException e) {
			return false;
		}
	}
	
	private Channel getChannel(Integer id) {
		return channels.get(id);
	}
}
