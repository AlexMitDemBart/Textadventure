package Models;

import java.util.ArrayList;

public class Player extends GameObject {
	public ArrayList<GameObject> inventory = new ArrayList<>();
	
	public Player(String name) {
		super(name);
		
	}
}
