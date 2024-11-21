package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMoveZero {
        public static void main(String[] args) {
            int[] array = new int[]{1, 3, 0, 7, 0, 2, 0, 10, 5,1,2,4};
            int[] arrayZero = new int[]{0};
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(arrayZero));
            System.out.println(Arrays.toString(moveNumber(array,0)));
            System.out.println(Arrays.toString(moveNumber(arrayZero,0)));
            System.out.println(Arrays.toString(moveNumber(array,1)));

        }

        private static int[] moveNumber(int[]arr,int n){
            List<Integer>result=Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.partitioningBy(number->number==n))
                    .values().stream()
                    .flatMap(List::stream)
                    .toList();
            return result.stream().mapToInt(Integer::intValue).toArray();

        }
}
