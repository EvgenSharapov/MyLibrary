package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4);
        //произведение всех чисел в numbers
        Optional<Integer>product=numbers.stream().reduce((a,b)->a*b);
        //2 варианта вывода
        System.out.println(product.get());
        product.ifPresent(System.out::println);
    }
}
