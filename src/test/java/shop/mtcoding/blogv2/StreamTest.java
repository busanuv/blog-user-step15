package shop.mtcoding.blogv2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void ex01_test(){
        List<String> names = List.of("Elice", "Bob", "chobi");

        List<String> result = names.stream()
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        result.forEach(s -> System.out.println(s));
    }

    @Test
    public void ex02_test(){
        List<String> fishes = List.of("광어", "숭어", "민어");

        List<String> result = fishes.stream()
                .map(fish -> fish+" 회뜸")
                .collect(Collectors.toList());

        result.forEach(s -> System.out.println(s));
    }
}
