package game;

import fixtures.Room;

public class RoomManager {

	static Room[] rooms;
	static Room startingRoom;

	public RoomManager init() {
		rooms = new Room[4];
//		System.out.println(rooms.length);
		Room foyer = new Room("The Foyer", "a small foyer",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen."
						+ "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		

		Room kitchen = new Room("The Kitchen", "A standard marble kitchen.",
				"A standard kitchen with marble floors, countertops, table, and wooden cupboards. Complete with an oven, microwave, and refridgerator.\n"
						+ "On the other end of the room is a door similar to the one behind you.\n"
						+ "On the table, there is a single pepper shaker right in the middle.");
		this.rooms[1] = kitchen;

		Room pantry = new Room("The Pantry", "A narrow pantry.",
				"A very narrow room with walls lined with racks filled by non-descript boxes and bags of food.\n"
						+ "Along one of the racks is a noticeably red ribbon. It is draping off of the side of the rack.\n"
						+ "At the other end of the room is the doorway. It is also wooden, with light coming out from under it.");
		this.rooms[2] = pantry;
		
		Room bedroom = new Room("The Bedroom", "A bedroom with glass walls.", "A spaceous room with glass walls, allowing the outside sunlight to shine through into the room.\n"
				+ "Adorning the room is a flatscreen TV on one wall, and a dresser on the other. Straight ahead is a queen-sized bed with red velvet bedsheets."
				+ "At the foot of the bed rests a white marble chest with a large golden lock on the front of it.");
		this.rooms[3] = bedroom;
		
		
		//foyer connections
		rooms[0].setNorth(kitchen);
		rooms[0].setWest(pantry);
		rooms[0].setEast(bedroom);
		rooms[0].setSouth(null);
		
		//kitchen connections
		rooms[1].setNorth(null);
		rooms[1].setWest(null);
		rooms[1].setEast(null);
		rooms[1].setSouth(foyer);
		
		//pantry connections
		rooms[2].setNorth(null);
		rooms[2].setWest(null);
		rooms[2].setEast(foyer);
		rooms[2].setSouth(null);
		
		//bedroom connections
		rooms[3].setNorth(null);
		rooms[3].setWest(foyer);
		rooms[3].setEast(null);
		rooms[3].setSouth(null);
		
		return this;
		
	}
}
