import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number

        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){

         Scanner scan = new Scanner(System.in);
          // Create a Scanner object 
          int guess = scan.nextInt(); 
          System.out.println(scan.hasNextDouble());   

        // Read user input
		
    	
        //use hasNextDouble to check if input is numeric, 
        // if so...
          if(scan.hasNextDouble()){
            if(rnd_number==guess){
                System.out.println("true");//   Compare it with the random number
        //   Let the user know the result of the comparison

            }
           else {
            if(rnd_number>guess){
                System.out.println("guess was lower than the target number try again");
                makeAGuess();
            }
            if(rnd_number<guess){
                System.out.println("guess was higher than the target number try again");
                makeAGuess(); //   Help the user by revealing wether the guess was lower or higher than the target number
       
            }


             

           }
           else {
            System.out.println("error");
            makeAGuess(); // if input was not numeric show an error message and call this method recursively
           }
            
          }
            

        
        //   Let the user try again by calling this method recursively
        
    }
   

}