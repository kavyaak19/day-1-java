import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
    
