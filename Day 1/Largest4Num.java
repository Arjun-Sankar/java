public class Largest4Num {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 15, d = 9;
        if (a > b && a > c && a > d) {
            System.out.println("a is largest");
        } else if (b > a && b > c && b > d) {
            System.out.println("b is largest");
        } else if (c > a && c > b && c > d) {
            System.out.println("c is largest");
        } else {
            System.out.println("d is largest");
        }

    }
}
