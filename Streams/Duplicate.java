package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,5,9,2,1,4,6,6,2,1,7,9};
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .filter(n->!unique.add(n))
                .collect(Collectors.toSet());
        System.out.println(unique);
        System.out.println(duplicates);
    }
}
