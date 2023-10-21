public class Largest3Num {
    public static void main(String [] args){
        int a=5;
        int b=6;
        int c=0;
        if(a>b && a>c){
            System.out.println("a is Largest Number");
        }
       else if(b>a && b>c){
            System.out.println("b is Largest Number");
        }else{
            System.out.println("c is Largest Number");
        }
    }
}
