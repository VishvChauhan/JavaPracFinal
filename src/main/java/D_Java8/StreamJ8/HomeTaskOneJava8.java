package D_Java8.StreamJ8;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeTaskOneJava8 {

    public static boolean palindromeString(String string){

        int start = 0;
        int end = string.length()-1;
        while(end>start){
            if(string.charAt(end)!=string.charAt(start)){
                return false;
            }
            start++;
            end--;
        }return true;
    }

  /*  public static boolean palindromeStringLambda(ArrayList [] arrayLists){

    }*/

    public static void main(String[] args) {

        System.out.println(palindromeString("naman"));
        System.out.println(palindromeString("naman1"));

    }



}
