package core.channel;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import core.groups.Group;
import core.messages.Message;
import core.user.User;
import network.sender.Sender;

/**
* @author alexandre
* Channel.java
*/
public class Channel {
	//Ids
	private static int id = 0;
	private int selfId;
	
	private String name;
	private Set<User> users;
	
	private Group restriction;
	
	private LinkedList<Message> messagesQueue;
	
	private Sender sender;
	
	public Channel(String name, Group restriction) {
		this.name = name;
		id++;
		selfId = id;
		
		users = new HashSet<User>();
		this.restriction = restriction;
		messagesQueue = new LinkedList<Message>();
	}
	
	public int getId() {
		return selfId;
	}
	
	public String getName() {
		return name;
	}
	
	public void disconnectUser(User u) {
		users.remove(u);
	}
	
	public boolean addMessage(Message m) {
		if (restriction.can(m.getOwner())) {
			synchronized (messagesQueue) {
				messagesQueue.add(m);
			}
			return true;
		} else 
			return false;
	}
	
	public Message popMessage() {
		synchronized (messagesQueue) {
			return messagesQueue.pop();
		}
	}
	
	public ConnectionStatus connectUser(User u) {
		//Success
		if(restriction.can(u)) {
			users.add(u);
			return ConnectionStatus.SUCCESS;
		} else { //Fail
			return ConnectionStatus.FAIL;
		}
			
	}
	
	
	public enum ConnectionStatus {
		SUCCESS, FAIL;
	}
	
		
}
