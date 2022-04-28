package A_CoreJava.StringTest;

public class ReverseAString {

    public static void main(String[] args) {

//Using For Loop to Reverse.
        String str = "vishu";
        char[] cha = str.toCharArray();
        String rev = "";

        int length = cha.length;

        for (int i = length - 1; i >= 0; i--) {
            rev += cha[i];
        }
        System.out.println(rev);

//Using While Loop to Reverse.
        String s = "vishu";
        char[] ch = s.toCharArray();

        int len = s.length();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println(ch);


//Using Char Array to Reverse.
        String str1 = "vishu";
        char[] ch1 = str1.toCharArray();
        int n = ch1.length;
        for (int x = 0; x < ch1.length; x++) {
            if (x <= n - 1) {
                char temp = ch1[x];
                ch1[x] = ch1[n - 1];
                ch1[n - 1] = temp;
                n--;
            }
        }
        System.out.println(ch1);


//Using StringBuffer to Reverse.
        StringBuffer sb = new StringBuffer(s);
        StringBuffer rev1 = (sb.reverse());
        System.out.println(rev1);

      /*  if (sb.equals(rev1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println(" not Palindrome");
        }
        String cap = "chauhan";
        System.out.println(cap.toUpperCase());*/
    }

}
