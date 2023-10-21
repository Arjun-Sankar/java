
import java.util.Scanner;

class GettingInputage{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age =input.nextInt();
        System.out.println("Your Age Is : "+age);

        //closing the scanner obj
        input.close();
        	
        // Scanner input = new Scanner(System.in);
    	
        // System.out.print("Enter an integer: ");
        // int number = input.nextInt();
        // System.out.println("You entered " + number);

    }  
}