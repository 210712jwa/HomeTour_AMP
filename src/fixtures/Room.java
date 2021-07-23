package fixtures;

public class Room extends Fixture {

	private Room[] exits;
	
	public Room north; //0
	public Room west; //1
	public Room south; //2
	public Room east; //3
	
	public Room wall;

	public Room(String name, String shortDescription, String longDescription) {

		super(name, shortDescription, longDescription);

		this.exits = new Room[4]; // Add size of array based on the number of directions that can be gone into, as
									// in if that direction has an exit or not.
	}

	public Room[] getExits() {
		return this.exits;
	}
	
	
	public void inspectRoom() {
		System.out.println(this.longDescription);
	}

	public Room getExit(String direction) {
		
		Room select = null;
		
		if (direction.equals("north")) {
			select = this.getNorth();
		}
			
		else if (direction.equals("south")) {
			select = this.getSouth();
		}
		
		else if (direction.equals("west")) {
			select =this.getWest();
		}
		
		else if (direction.equals("east")) {
			select = this.getEast();
		}
		
		if(select.equals(null)) {
			select = this.getWall();
			System.out.println("There is a wall here. You can't move in this direction.");
		}
		
		return select;
		
	}
	
	
	//Getter & Setters
	public Room getNorth() {
		return this.north;
	}
	
	public Room getWest() {
		return this.west;
	}
	
	public Room getSouth() {
		return this.south;
	}
	
	public Room getEast() {
		return this.east;
	}
	
	public Room getWall() {
		return this;
	}
	
	
	public void setNorth(Room newRoom) {
		this.north = newRoom;
	}
	
	public void setWest(Room newRoom) {
		this.west = newRoom;
	}
	
	public void setSouth(Room newRoom) {
		this.south = newRoom;
	}
	
	public void setEast(Room newRoom) {
		this.east = newRoom;
	}
	
}
