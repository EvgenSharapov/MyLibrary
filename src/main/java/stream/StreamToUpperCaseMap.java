package stream;

import java.util.stream.Stream;

public class StreamToUpperCaseMap {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("a","b","c").map(String::toUpperCase);
        //Stream<String>upperStream=stream.map(String::toUpperCase);
        //upperStream.forEach(System.out::print);
        stream.forEach(System.out::print);
    }
}
