package game;

import fixtures.Room;

public class RoomManager {

	public static Room[] rooms;
	static Room startingRoom;

	public void init() {
		rooms = new Room[4];
//		System.out.println(rooms.length);
		Room foyer = new Room("The Foyer", "A small foyer.",
				"The small entryway of a neo-colonial house. A kitchen is open to the north, where a large table can be seen."
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

		Room living = new Room("The Living Room", "A quaint living room.",
				"A living room with brown walls and beige furniture.\n"
						+ "There is a television on the opposite side of the room, currently off.\n"
						+ "There is one couch, two sofas, and a coffee table arranged throughout the room.");
		this.rooms[2] = living;
		
		Room bedroom = new Room("The Bedroom", "A bedroom with glass walls.", "A spaceous room with glass walls, allowing the outside sunlight to shine through into the room.\n"
				+ "Adorning the room is a flatscreen TV on one wall, and a dresser on the other. Straight ahead is a queen-sized bed with red velvet bedsheets."
				+ "At the foot of the bed rests a white marble chest with a large golden lock on the front of it.");
		this.rooms[3] = bedroom;
		
		Room wall = new Room("A wall" , "This is a wall.", "This is a REALLY LONG WALL.");
		
		
		//foyer connections
		rooms[0].setNorth(kitchen);
		rooms[0].setWest(living);
		rooms[0].setEast(bedroom);
		rooms[0].setSouth(foyer);
		
		//kitchen connections
		rooms[1].setNorth(kitchen);
		rooms[1].setWest(kitchen);
		rooms[1].setEast(kitchen);
		rooms[1].setSouth(foyer);
		
		//pantry connections
		rooms[2].setNorth(living);
		rooms[2].setWest(living);
		rooms[2].setEast(foyer);
		rooms[2].setSouth(living);
		
		//bedroom connections
		rooms[3].setNorth(bedroom);
		rooms[3].setWest(foyer);
		rooms[3].setEast(bedroom);
		rooms[3].setSouth(bedroom);
				
	}
}
