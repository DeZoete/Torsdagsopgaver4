import java.util.Scanner;
import java.util.ArrayList;
class GameMenu{



private ArrayList<String> actions; //4.b Add a private instance variable, actions of type ArrayList<String> to the class.

GameMenu(ArrayList<String> actions){
	this.actions = actions;




}

public void displayMenu(){

	for(String action: actions){
		System.out.println(action);
	}

}

 public String getAction(){

 	System.out.println("Type a number to choose an action");

 	displayMenu();

 	Scanner scan = new Scanner(System.in);
 	String choice = scan.nextLine();
 	return choice; 
 }
}