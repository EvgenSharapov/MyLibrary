package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class StreamFindByTheFirstLetter {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {{
            add("Гарри");
            add("Поттер");
            add("Книга");
        }};
       Optional<String> name=list.stream().filter(s -> s.startsWith("Г")).findAny();
        System.out.println(name.get());
        name=list.stream().filter(s -> s.startsWith("П")).findAny();
        System.out.println(name.get());
        name=list.stream().filter(s -> s.startsWith("К")).findAny();
        System.out.println(name.get());
    }
}
