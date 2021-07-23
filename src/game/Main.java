package game;

import java.util.Scanner;

import game.RoomManager;
import fixtures.Room;

public class Main {
	
	static RoomManager house = new RoomManager();
	static Player player = new Player();
	public static void main(String[] args) {
		
		house.init();
		//System.out.println(house.startingRoom.getName());
		player.currentRoom = house.startingRoom;
		
		
		System.out.println("You are on a house tour, looking for a new place to live.");
		System.out.println("You aren't sure how many homes you've looked at so far, but you hope this next one is the last.");
		System.out.println("As you walk up to the door, you notice that this new place is very... narrow.");
		System.out.println("Nonetheless, you enter the house.\n\n");
		
		printRoom(player); //establishes the player in the first room: the foyer.
		
		System.out.println("\nWhat do you want to do?\n");
		Room temp = player.currentRoom;
		while (player.currentRoom != null) {
			

			String[] command = collectInput();
			
			if (temp.name.equals("The Foyer") & command[1].equals("south"))
			{
				System.out.println("Now exiting the house. goodbye!");
				break;
			}
			
			else {
				temp = player.currentRoom;
				parse(command, player);
			}
			//System.out.println(command[0]);
			

		}
		
	}
	
	public static void printRoom(Player player) {
		System.out.println(player.currentRoom.name);
		System.out.println(player.currentRoom.shortDescription);
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
		
		
		if (action.equals("go")) {
			System.out.println("\n");
			player.currentRoom = player.currentRoom.getExit(subject);
			printRoom(player);
		}
		
		else if (action.equals("inspect")) {
			player.currentRoom.inspectRoom();
		}
		
		else {
			System.out.println("Invalid command. Try again.");
		}
		
		
	}
}
