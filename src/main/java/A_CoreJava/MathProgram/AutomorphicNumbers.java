package A_CoreJava.MathProgram;

public class AutomorphicNumbers {

    public static boolean AutomorphicNum(int num){
        int  temp = num*num;
        while(num > 0){
            if(  num%10 != temp%10){
                return false;
            }
            num =num/10;
            temp =temp/10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(AutomorphicNum(1245));
    }
}
