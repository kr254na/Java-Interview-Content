package Streams;
import java.util.*;

public class Maximum {
    public static void main(String[] args){
        int arr[] = {5,9,2,1,4,6,2};
        int max = Arrays.stream(arr).boxed().max(Integer::compare).get();
        System.out.println(max);
    }
}
