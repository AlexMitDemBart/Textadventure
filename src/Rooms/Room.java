package Rooms;

import Models.GameObject;

public abstract class Room extends GameObject{
	private String description;
	
	public Room(String name, String description) {
		super(name);
		this.description = description;
	}
	
	public String getDescription() {return description;}
	
	public abstract String lookAround();
}
