package A_CoreJava.MathProgram;

public class EvenOrOddNumber {

    public static boolean evenOdd(int num){
        boolean status = false;

        if( num%2 == 0)
        {
            status = true;
        };
        return status;
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(11));
    }
}
