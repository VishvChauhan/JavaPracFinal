package A_CoreJava.StringTest;

public class StringClassMethods {
    public static void main(String[] args) {

        String name = "vishu chauhan";
        String myname = new String("vishu");
        byte[] b_arr = {71, 101, 101, 107, 115};
        String s_byte = new String(b_arr);
        System.out.println(name + " : "+ myname + " : "+ s_byte);
        System.out.println(name .length());
        System.out.println(name.substring(1,3));
        System.out.println(name.concat(myname));
        System.out.println(name.indexOf('C'));
        System.out.println(name.equals(myname));
        System.out.println(name.compareTo(myname));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace('v','J'));

    }
}
