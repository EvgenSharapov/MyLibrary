package collections.list;

import java.util.Arrays;
import java.util.List;

public class ListToUpperCase {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("а","б","в");
        list.replaceAll(String::toUpperCase);
        list.forEach(System.out::print);
    }
}
