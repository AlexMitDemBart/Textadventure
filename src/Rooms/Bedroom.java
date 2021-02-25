package Rooms;

public class Bedroom extends Room {

	public Bedroom(String name, String description) {
		super(name, description);
	}

	@Override
	public String lookAround() {
		return "Dein Schlafzimmer.. ein vertrauter Ort..";
	}

}
