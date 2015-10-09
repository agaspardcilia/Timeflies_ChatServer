package channel;

import java.util.HashSet;
import java.util.Set;

import groups.Group;
import user.User;

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
	
	public Channel(String name, Group restriction) {
		this.name = name;
		id++;
		selfId = id;
		
		users = new HashSet<User>();
		this.restriction = restriction;
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
	
	public ConnectionStatus connectUser(User u) {
		//Success
		if(restriction.can(u)) {
			users.add(u);
			return ConnectionStatus.SUCCESS;
		} else { //Fail
			return ConnectionStatus.FAIL;
		}
			
	}
	
	private enum ConnectionStatus {
		SUCCESS, FAIL;
	}
	
}
