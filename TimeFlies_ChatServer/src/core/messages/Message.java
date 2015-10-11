package core.messages;

import java.security.Timestamp;
import java.util.Date;

import core.channel.Channel;
import core.user.User;

/**
* @author alexandre
* Message.java
*/
public class Message {
	private final String content;
	private final User owner;
	private final int destination;
	private final Date timestamp;
	
	public Message(User owner, String content, int destinationId) {
		this.owner = owner;
		this.content = content;
		this.destination = destinationId;
		
		timestamp = new Date(System.currentTimeMillis());
	}
	
	public String getContent() {
		return content;
	}
	
	public User getOwner() {
		return owner;
	}
	
	public int getDestination() {
		return destination;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
}
