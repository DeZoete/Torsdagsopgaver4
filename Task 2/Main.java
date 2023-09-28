import java.util.Scanner; //2.c

class Main{

public static void main(String[] args){ //2.a


        Scanner scan = new Scanner(System.in); //2.c
        System.out.println("Please type your name");

        String input = scan.nextLine();//2.d

        //2.e
         System.out.println(input);
        System.out.println("\nPlease type your age");
        //2.f 
        int age = scan.nextInt();
        System.out.println(age);

        int ret = 67 - age;
        System.out.println(ret);
}

}