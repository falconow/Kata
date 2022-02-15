package Task6213;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer [] i1 = {1, 2 , 3};
        Integer [] i2 = {0, 1, 2};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(i1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(i2));

        System.out.println(symmetricDifference(set1,set2));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        HashSet<T> result = new HashSet<>(set1);
        result.addAll(set2);
        result.removeAll(intersection);
        return result;
    }
}
