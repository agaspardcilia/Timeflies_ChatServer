package groups;

import java.util.HashSet;
import java.util.Set;

import user.User;

/**
* @author alexandre
* PrivateGroup.java
*/
public class PrivateGroup extends Group {
	private static int id = 1;
	
	private final static int DEFAULT_POWER = 15;
	
	private Set<User> members;
	private User owner;
	
	public PrivateGroup(User owner) {
		super("Private group #" + id, DEFAULT_POWER);
		id++;
		
		members = new HashSet<User>();
	}
	
	public PrivateGroup(User owner, Set<User> members) {
		this(owner);
		this.members.addAll(members);
	}
	
	//TODO Only let the owner add users.
	public void addUser(User u) {
		members.add(u);
	}
	
	public void removeUser(User u) {
		members.remove(u);
	}
	
	public boolean can(User u) {
		return members.contains(u);
	}
}
