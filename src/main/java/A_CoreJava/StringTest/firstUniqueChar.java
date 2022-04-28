package A_CoreJava.StringTest;

public class firstUniqueChar {

    public static char firstUnique(String str){

        char [] ch = str.toCharArray();
        char first = 0;

        for(int i=0; i <ch.length-1; i++){
            if(ch[i]==ch[i+1]){
                first = ch[i];
                break;
            }
        }
        return first;
    }


    public boolean hello(String str){
        System.out.println("hello");
        firstUnique("hello");

        return false;
    }


    public static void main(String[] args) {
        firstUniqueChar f = new firstUniqueChar();
        System.out.println(firstUnique("hello"));
        System.out.println(f.hello(("yess")));
    }
}
