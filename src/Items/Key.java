package Items;

import Models.GameObject;

public class Key extends GameObject implements Item {
	private String description;
	
	public Key(String name, String description) {
		super(name);
		this.description = description;
	}

	@Override
	public boolean useOn(GameObject obj) {
		if(this.id == obj.id)
			return true;
		return false;
	}

	@Override
	public String getDescription() {return description;}
}
