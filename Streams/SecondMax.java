package Streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {5,9,2,1,4,6,2};
        int secondMax = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondMax);
    }
}
