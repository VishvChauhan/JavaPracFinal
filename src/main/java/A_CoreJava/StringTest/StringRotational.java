package A_CoreJava.StringTest;

public class StringRotational {

//Write a code to check whether one string is a rotation of another?
// String a = 'geek';
// String b = 'keep';
// String c = 'peek';


    public static boolean checkStringRotation( String one, String two){
        if (one.length() != two.length())
        {
            return false;
        }

        String three = one + one;

        if(three.contains(two))
        {
            return true;
        }
		else
        {
            return false;
        }
    }
    public boolean rotationsString( String one, String two){
        return (one.length() == two.length()) && ((one+two).indexOf(two) != -1);
    }


    public static void main(String[] args) {
        System.out.println(checkStringRotation("peek", "Keep"));
    }
}
