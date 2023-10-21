import java.util.Random;
import java.util.Scanner;

public class OtpGenerate {
    public static void main(String args[]) {
        Random rand = new Random();
        int randomOtp = rand.nextInt(10000);
        System.out.println(randomOtp);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Four Digits OTP : ");
        int otp = input.nextInt();
        if (otp == randomOtp) {
            System.out.println("Your OTP is Matched");
        } else {
            System.out.println("Your OTP is Notmatched");
        }
        input.close();
    }
}
