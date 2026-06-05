import java.util.*;


public class Set2Eg {
    public static void main(String[] args) {
    Set<Integer> s = new HashSet<>();
    int[] arr = {1, 2, 3, 11, 2,3};
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }
    System.out.println(set);
    System.out.println(set.size());
}
}
