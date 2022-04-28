package A_CoreJava.StringTest;

public class RemoveAllWhiteSpaces {

//How do you remove all white spaces from a string in java?
// String = "aba bc df sa s";

        public static void main(String[] args) {
            String str = " my name is T o m";

            // With String Method
            String o = str.replaceAll("\\s","");
            System.out.println(o);

            // With String Class
            char [] chars = str.toCharArray();
            String s = "";
            for( int i =0;i <chars.length; i++){
                if((chars[i] != ' ')&&(chars[i]!='\t'))
                {
                    s+=chars[i];
                }
            }
            System.out.println(s);

            // With StringBuffer
            StringBuffer sb = new StringBuffer("");
            for( int i =0;i <chars.length; i++){
                if((chars[i] != ' ')&& (chars[i] != '\t')){
                    sb.append(chars[i]);
                }
            }
            System.out.println(sb);
        }

}
