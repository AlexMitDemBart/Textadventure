package Maingame;

import java.util.ArrayList;
import Models.Player;
import Rooms.Basement;
import Rooms.Bedroom;
import Rooms.Floor;
import Rooms.Kitchen;
import Rooms.Room;

public class TextadventureGame {
	private ArrayList<Room> map = new ArrayList<Room>();
	private Player player;
	private Dialogs dialog;
	private Room actualRoom;
	
	public TextadventureGame(Dialogs dialog) {
		this.dialog = dialog;
	}

	public static void main(String[] args) {
		TextadventureGame tGame = new TextadventureGame(new Dialogs());
		tGame.newGame();
		
		if(tGame.map.size() > 0)		
		tGame.actualRoom = tGame.map.get(0);
		
		tGame.dialog.askPlayerForInput();
	}
	
	public void newGame() {
		map = createRooms();
		player = new Player("Player");
		dialog.newGame();
	}

	private ArrayList<Room> createRooms() {
		map.add(new Bedroom("Bedroom", "Dein Schlafzimmer.. Hier erholst du dich Nachts.."));
		map.add(new Floor("Floor", "Ein Flur der die Zimmer miteinander verbindet.."));
		map.add(new Kitchen("Bedroom", "Deine Küche.. Deine Eltern kochen hier jeden Abend für dich.."));
		map.add(new Basement("Basement", "Dein Keller.. du fandest ihn schon immer Unheimlich.."));
		
		return map;
	}
}
