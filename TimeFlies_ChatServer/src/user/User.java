package user;

import java.util.UUID;

import groups.Group;

/**
* @author alexandre
* User.java
*/
public class User {
	//Identification
	private UUID id;
	private String name;
	
	private Group group;
	
	
	public Group getGroup() {
		return group;
	}
	
}
