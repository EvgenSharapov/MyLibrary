package stream;

import java.util.stream.Stream;

public class StreamPeekFilter {
    public static void main(String[] args) {
        Stream<String>stream=Stream.of("a","b","c")
                .peek(System.out::print).map(String::toUpperCase)
                .filter(s->s.equals("B"));
        long count= stream.count();
        System.out.println("Count: "+count);
    }
}
