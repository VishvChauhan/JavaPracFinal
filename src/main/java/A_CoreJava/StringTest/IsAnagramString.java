package A_CoreJava.StringTest;

import java.util.Arrays;

public class IsAnagramString {
    public static void isAnagram(String a, String b){

        String s1 = a.replaceAll("\\s", "");
        String s2 = b.replaceAll("\\s", "");


        if(s1.length()==s2.length()){
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println(" yes ");
            }else{
                System.out.println("No");
            }
        }
        else{
            System.out.println(" not Anagram");
        }

    }

    public static void main(String[] args) {


        isAnagram("Keep", "Peek");
        isAnagram("Keap", "Peek");
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("Mother In 45 Law", "Hitler Woman");


    }
}
