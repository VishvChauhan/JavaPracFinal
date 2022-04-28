package A_CoreJava.StringTest;

import java.util.*;




public class PalindromeString {

    public static boolean palindromeString(String string){
        boolean status = false;
        char [] character = string.toCharArray();

        int n = string.length();
        int start = 0;
        int end = n-1;

        while(start<=end){
            char temp = character[start];
            character[start] = character[end];
            character[end] = temp;

            start++;
            end--;}

        String rev = character.toString();

        if(rev.equals(rev)){
            status = true;
        }
        return status;
    }

/*
 * withExisting Method =
 * => 1 - Existing String (StringBuffer) method
 * => 1 - Existing String (StringBuilder) method
 * => 2 - Swapping characters String method
 * => 3 - Creating a new String method
 * => 4 - Using a List method
 * => 5 - Using Stack String method
 * => 6 - Using recursion String method
 * => 7 - Using lambda String method
 *  */

    public static boolean palindromeString(String sValue,int withExistingMethod ){
                boolean status = false;


                if(withExistingMethod == 0) {
                    StringBuffer reversedStringBuffer = new StringBuffer(sValue);
                    reversedStringBuffer.reverse(); // reversing string
                    if (reversedStringBuffer.equals(sValue)) {
                        status = true;
                    }

                }

                else if(withExistingMethod == 1) {

                    StringBuilder stringBuildervarible = new StringBuilder(sValue);
                    //stringBuildervarible.append(sValue);
                    String rev = String.valueOf(stringBuildervarible.reverse());
                    if (rev.equals(sValue)) {
                        status = true;
                    }

                }

                else if(withExistingMethod == 2){

                    char[] arrC = sValue.toCharArray();
                    int n = sValue.length();
                    int start = 0; int end= n-1;
                    while(start<=end){
                        char temp = arrC[start];
                        arrC[start]=arrC[end];
                        arrC[end]=temp;
                        start++;
                        end--;
                    }
                    String rev1 = String.valueOf(arrC);
                    System.out.println(rev1);
                    if (rev1.equals(sValue)) {
                        status = true;
                    }
                }

                else if (withExistingMethod == 3){

                    String rev3 ="";
                    for( int i=0; i < sValue.length(); i++){
                        char Character = sValue.charAt(i);
                        rev3 = Character + rev3;
                    }
                    System.out.println(rev3);
                    if( rev3.equals(sValue)){
                        status = true;
                    }
                }

                else if(withExistingMethod ==4){
                    char[] str = sValue.toCharArray();
                    List<char[]> list1 = Arrays.asList(str);
                    List<Character> list2 = new ArrayList<>();
                    for( char c : str){
                        list2.add(c);
                    }

                    List<Character> list3 = new ArrayList<>();

                    list3.addAll(list2);
                    Collections.reverse(list2);
                    System.out.println(list2);

                    if(list3.equals(list2)){
                        status = true;
                    }
                }


        else if (withExistingMethod ==5)
        {
            Stack<Character> stack = new Stack<>();

            for(int i=0; i <sValue.length();i++){
                stack.push(sValue.charAt(i));
            }
            String rev = "";

            while(!stack.isEmpty()){
                rev = rev +stack.pop();
            }

            if(sValue.equals(rev)){
                status = true;
            }

        }
        else if (withExistingMethod ==6){
            // recursion
        }


        return status;
    }

    public static void main(String[] args) {

        System.out.println(palindromeString("naman"));

        System.out.println(palindromeString("abcb23a", 5));
        System.out.println(palindromeString("abcb1a", 5));
    }
}
