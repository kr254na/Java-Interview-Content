package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        String s = "Mississippi";
        Map<Character,Long> freq = s.chars()
                .boxed()
                .collect(Collectors.groupingBy(
                        ascii-> (char)ascii.intValue(),
                        LinkedHashMap::new,                               //Preserves order
                        Collectors.counting()
                ));
        System.out.println(freq);
    }
}
