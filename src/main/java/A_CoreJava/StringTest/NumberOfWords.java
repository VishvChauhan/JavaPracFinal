package A_CoreJava.StringTest;

public class NumberOfWords {

//Write a Java program to count the number of words in a string?
//String one ="    India Is My Country";

    public static int noOfWord( String one) {
        int count = 0;

        char [] word = new char[one.length()];
        for(int i=0; i<word.length; i++){
            word[i] = one.charAt(i);
            if( ((i>0)&&(word[i]!=' ')&&(word[i-1]==' '))
                    || ((word[0]!=' ')&&(i==0)))
            {
                count++;
            }
        }
        System.out.println(word);
        return count;
    }


    public static void main(String[] args) {
        System.out.println(noOfWord("this is a new test"));
    }
}
