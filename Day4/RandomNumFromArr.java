import java.util.Random;

public class RandomNumFromArr {
    public static void main(String args[]) {
        int[] arr = { 56, 45, 87, 34, 16 };
        Random rand = new Random();
        System.out.println(arr[rand.nextInt(arr.length)]);
    }
}
