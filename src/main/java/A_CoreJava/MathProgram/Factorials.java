package A_CoreJava.MathProgram;

public class Factorials {
    public static int  FactorialRecursive(int n) {

        if(n==0){
            return 1;
        }
        else {
            return n * FactorialRecursive(n - 1);
        }
    }
    public static int  Factorial (int n) {
        int fact = 1;
        for( int i=1; i <= n; i ++){
            fact = fact *i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(FactorialRecursive(5));
        System.out.println(Factorial(5));
    }
}
