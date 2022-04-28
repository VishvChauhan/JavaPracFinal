package D_Java8.EpamAssignment.HM1;

public class AreRotationString {

    public static boolean StringRotation(String str1, String str2, StringRotationI s){
        return  s.areRotations( str1,  str2);
    }


    public static void main(String[] args) {

        String strA = "ABACD";
        String strB = "ABACD";
        boolean s =  StringRotation(strA, strB, (str1, str2) -> {
            return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
        });

        System.out.println(s);

    }
}

@FunctionalInterface
interface StringRotationI {
    boolean areRotations(String str1, String str2);
}