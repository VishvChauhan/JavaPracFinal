package A_CoreJava.MathProgram;

public class FibonacciSeriesTillCount {
    public static void printFibonacci(){

        int n1 = 0,n2=1, n3, count=10;

        System.out.println(n1 +" " + n2);

        for( int i = 0; i <count;i ++){
            n3=n1+n2;
            System.out.print(n3 + " ");
            n1=n2;
            n2=n3;
        }

    }

    public static void main(String[] args) {
        printFibonacci();
    }

}