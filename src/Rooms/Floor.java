package Rooms;

public class Floor extends Room{

	public Floor(String name, String description) {
		super(name, description);
	}

	@Override
	public String lookAround() {
		return "Die Dinger auf den Familienbildern an den W�nden, sehen aus wie verdrehte Kreaturen deiner urspr�nglichen Familie..";
	}

}
