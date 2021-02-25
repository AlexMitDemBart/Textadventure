package Models;

import java.util.UUID;

public class GameObject {
	public String name;
	public String id;
	
	public GameObject(String name) {
		this.name = name;
		this.id = UUID.randomUUID().toString();
	}
}
