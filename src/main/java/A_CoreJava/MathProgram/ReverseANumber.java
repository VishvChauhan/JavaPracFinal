package A_CoreJava.MathProgram;

public class ReverseANumber {

    public static int reverseNum(int num){
        int rev =0;
        while(num!=0){
            int temp = num%10;
            rev = (rev*10)+temp;
            num = num/10;
        }
        return rev;
    }

    public static int reverseRecursive(int num){
        if( num<10){
            System.out.println(num);
        }
        else{
            System.out.print(num%10);
            reverseRecursive(num/10);
        }return num;
    }


    public static void main(String[] args) {
        System.out.println(reverseNum(124525));
        System.out.println(reverseRecursive(124525));

    }
}
