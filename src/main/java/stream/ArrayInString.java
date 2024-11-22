package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayInString {
    public static void main(String[] args) {
        String[]str={"Села","муха","на","варенье"};
        String string1=Arrays.stream(str).collect(Collectors.joining());
        String string2= String.join(" ", str);
        System.out.println(string1);
        System.out.println(string2);


    }


}
