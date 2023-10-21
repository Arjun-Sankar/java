public class array {
    public static void main(String args[]) {
        int[] age = { 25, 54, 18, 62, 32 };
        for (int i = 0; i < age.length; i++) {
            System.out.println((i + 1) + ".Person = " + age[i]);
        }
        // for (int a : age) {
        // System.out.println(a);
        // }
    }
}
