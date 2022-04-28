package D_Java8.EpamAssignment.HM1;

import java.util.stream.IntStream;

public class PalindromeString {

    public boolean isPalindromeW(String string) {
        StringBuilder reverse = new StringBuilder(string).reverse();
        return (reverse.toString()).equals(string);
    }

    public static LambdaPalindrome1 pc = s -> {
        StringBuilder reverse = new StringBuilder(s).reverse();
        return (reverse.toString()).equals(s);
    };

    public static LambdaPalindrome1 pc1 = s-> IntStream.range(0, s.length()/2).
            noneMatch(i -> s.charAt(i) != s.charAt(s.length() - i -1));
}

interface LambdaPalindrome1{
    boolean check(String string);
}
