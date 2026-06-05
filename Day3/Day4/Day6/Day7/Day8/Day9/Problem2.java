import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        String str = "Banana".toLowerCase();

        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> repeated = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (seen.contains(ch)) {
                repeated.add(ch);
            } else {
                seen.add(ch);
            }
        }

        System.out.println(repeated);
    }
}


