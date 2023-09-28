import java.util.Scanner;
import java.util.ArrayList;

class Main{


	public static void main(String[] args){
		ArrayList<String> actions = new ArrayList<String>();

		actions.add("1: start game");
		actions.add("2: Resume game");
		actions.add("3: Pause game");
		actions.add("4: End game");


	GameMenu game = new GameMenu(actions);

	game.displayMenu();

	game.getAction();
	String userChoice = game.getAction();
	int user = Integer.parseInt(userChoice);
	doAction(user);


	}

	public static void doAction(int action){

		switch (action) {
  case 1:
  System.out.println("Starting the game now");
  break;

   case 2:
 System.out.println("Fetching previously saved game dat");
  break;

   case 3:
  System.out.println("Game Paused");
  break;

   case 4:
  System.out.println("Ending game");
  break;
  default:
  	System.out.println("choose an option from the list");

	}
	
}

}