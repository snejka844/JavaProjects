package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamMaking {
    public static void main(String[] args) {
       /* List<String> myList = Arrays.asList("aBc", "d", "ef", "123456");
        myList
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out :: println);*/
Stream.of("aBc","d","ef","12345")

        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out :: println);
    }
}
