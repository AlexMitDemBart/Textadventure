package Rooms;

public class Kitchen extends Room {

	public Kitchen(String name, String description) {
		super(name, description);
	}

	@Override
	public String lookAround() {
		return "Auf der Kücheninsel befindet sich eine Schale mit verdorbenem Obst..";
	}

}
