package stream;

import java.util.Arrays;

public class MaxInArrayStream1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int max=Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);
    }
}
