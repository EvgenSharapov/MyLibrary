package stream;

import java.util.List;

public class MaxLengthInList {
    public static void main(String[] args) {
        List<String>list=List.of("gogogo","fa","mats","ergergerg","deebebgebeb");
        int x=list.stream().mapToInt(String::length).min().orElse(0);
        System.out.println(x);
    }
}
