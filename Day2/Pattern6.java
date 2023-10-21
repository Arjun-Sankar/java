package Day2;

public class Pattern6 {
    public static void main(String args[]) {
        for (int i = 1; i <= 25; i++) {
            if (i % 5 == 0) {
                System.out.println(i+" ");
                System.out.println(" ");
            }
            System.out.print(i+" ");
        }
    }
}
