class TwoDArray {
    public static void main(String args[]) {
        int[][] arr = {
                { 5, 4, 9 },
                { 4, 8, 7 },
                { 1, 0, 5 }
        };
        // System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}