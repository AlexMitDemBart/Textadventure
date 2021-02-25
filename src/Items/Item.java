package Items;

import Models.GameObject;

public interface Item {
	public boolean useOn(GameObject obj);
	public String getDescription();
}
