package groups;

import user.User;

/**
* @author alexandre
* Group.java
*/
public abstract class Group {
	private String name;
	
	private int power;//Group power.
	
	public Group(String name, int power) {
		this.name = name;
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean can(User u) {
		return u.getGroup().getPower() >= power;
	}
	
	@Override
	public String toString() {
		return "Group " + name + "(" + power + "p)";
	}
	
}
