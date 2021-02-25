package Rooms;

public class Floor extends Room{

	public Floor(String name, String description) {
		super(name, description);
	}

	@Override
	public String lookAround() {
		return "Die Dinger auf den Familienbildern an den Wänden, sehen aus wie verdrehte Kreaturen deiner ursprünglichen Familie..";
	}

}
