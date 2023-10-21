import java.util.Scanner;

public class GettingUsername {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.next();
        System.out.println("Your Name Is : " + name);

        input.close();
    }
}
