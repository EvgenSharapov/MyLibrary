package collections.optional;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional<String> opt=Optional.of("Java3").filter(s ->s.length()>4);
        System.out.println(opt.orElse("Default"));
    }
}
