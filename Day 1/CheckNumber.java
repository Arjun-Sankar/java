public class CheckNumber {
    public static void main(String[] args){
        char num='5';
        if(Character.isDigit(num)){
            System.out.println(num+" is a number");
        }else{
            System.out.println(num+ " it is not an number");
        }
    }
}
