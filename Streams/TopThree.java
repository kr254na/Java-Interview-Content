package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopThree {
    public static void main(String[] args) {
        int arr[] = {5,9,2,1,4,6,9,2};
        List<Integer> topThree = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(topThree);
    }
}
