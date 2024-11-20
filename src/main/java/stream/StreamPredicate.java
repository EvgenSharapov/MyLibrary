package stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPredicate {
    public static void main(String[] args) {
        String[]names={"Java","Go","JavaScript","Python","Java"};
        String name="Java";
        Predicate predicate=name::equals;//name-ссылка
        System.out.println(Stream.of(names).filter(predicate).count());
        name="Kotlin";
        System.out.println(Stream.of(names).filter(predicate).count());


        System.out.println(4^2);
    }
}
