package Rooms;

public class Basement extends Room{

	public Basement(String name, String description) {
		super(name, description);
	}

	@Override
	public String lookAround() {
		return "Das Licht der schwachen Glühbirne flackert unstetig vor sich hin..";
	}

}
