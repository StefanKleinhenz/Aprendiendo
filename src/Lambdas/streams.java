package Lambdas;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {
    
    public static void main(String[] args) {

        IntStream.rangeClosed(1,50).forEach(System.out::println);


        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7);
        intStream.forEach(System.out::println);
    }
    
}

