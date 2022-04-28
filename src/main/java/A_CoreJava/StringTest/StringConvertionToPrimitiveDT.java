package A_CoreJava.StringTest;

public class StringConvertionToPrimitiveDT {

//How to convert String to Integer and Integer to String in java
        public static void main(String []args){
            int a = 10;

            String str2 = Integer.toString(a);
            String str1 = String.valueOf(a);
            Integer intA = Integer.valueOf(str2);
            int intB = Integer.parseInt(str1);

        }

}
