package A_CoreJava.MathProgram;

public class Armstrongs {
    public static void Armstrong(int n){

        int temp, digits=0, last=0, sum=0;
        temp=n;

        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Armstrong(1012);
    }
}
