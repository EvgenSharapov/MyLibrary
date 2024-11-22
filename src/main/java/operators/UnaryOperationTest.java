package operators;

import java.util.Objects;
import java.util.function.UnaryOperator;

public class UnaryOperationTest {
    public static void main(String[] args) {
        UnaryOperator<Integer>square=x->x*x;
        UnaryOperator<String>toUpperCase= String::toUpperCase;
        UnaryOperator<Integer>increment=y->++y;

        System.out.println(square.apply(4));
        System.out.println(toUpperCase.apply("java"));
        System.out.println(increment.apply(1));
    }

}
