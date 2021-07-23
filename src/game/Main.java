package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	public static void main(String[] args) {
		RoomManager house = new RoomManager();
		house = house.init();
		Player player = new Player();
		//System.out.println(house.startingRoom.getName());
		player.currentRoom = house.startingRoom;
		
		
		System.out.println("You are on a house tour, looking for a new place to live.");
		System.out.println("You aren't sure how many homes you've looked at so far, but you hope this next one is the last.");
		System.out.println("As you walk up to the door, you notice that this new place is very... narrow.");
		System.out.println("Nonetheless, you enter the house.\n\n");
		
		printRoom(player); //establishes the player in the first room: the foyer.
		
		System.out.println("\nWhat do you want to do?\n");
		
		while (player.currentRoom != null) {
			
			String[] command = collectInput();
			System.out.println(command[0]);
			parse(command, player);

		}
		
	}
	
	public static void printRoom(Player player) {
		System.out.println(player.currentRoom.longDescription);
	}
	
	public static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] separate = null;
		if (input.length() >= 1) {
			separate = input.split(" ");
		}
		//Use Scanner object to collect inputs for actions and targets of actions (if any)
		return separate;
	}
	
	private static void parse(String[] command, Player player) {
		String action = command[0]; //The first input word: the action
		String subject = command[1]; //The second input word: the subject/direction
		action = action.toLowerCase();
		
		
		if (action == "go") {
			player.currentRoom = player.currentRoom.getExit(subject);
		}
		
//		else if (action == "inspect") {
//			
//		}
		
		else {
			System.out.println("Invalid command. Try again.");
		}
		
		
	}
}
