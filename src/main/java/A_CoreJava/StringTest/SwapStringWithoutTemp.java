package A_CoreJava.StringTest;

//How do you swap two string variables without using third or temp variable in java?


public class SwapStringWithoutTemp {
    public static String swapString( String one, String two) {
        one = one + two;
        two = one.substring(0,one.length()-two.length());
        one = one.substring(two.length());
        return one +" " + two;
    }


    public static void main(String[] args) {
        System.out.println(swapString(  "one",  "two"));
    }
}
