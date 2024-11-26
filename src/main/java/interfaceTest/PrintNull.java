package interfaceTest;

import java.util.ArrayList;
import java.util.Optional;
interface B{
    int c=10;
}


public class PrintNull implements B {
    interface I{
        String generate();
        default void print(String value){
            System.out.println(Optional.ofNullable(value).orElseGet(this::generate));
        }
    }

    public static void main(String[] args) {
        ((I)()->"Hello!").print(null);

    }

}
