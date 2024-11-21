package stream;

import java.util.Arrays;

public class ArrayContainsElement {
    public static void main(String[] args) {
        String[]arrayString={"AB","BC","CD","DE"};
        String contStr="AB";
        int[]arrayInt={1,2,3,4,5};
        int contInt=1;

        System.out.printf("Массив arrayString содержит %s?-"+containsStringArray(arrayString,contStr),contStr);
        System.out.println();
        System.out.printf("Массив arrayInt содержит %d?-"+containsIntArray(arrayInt,contInt),contInt);
    }

    private static boolean containsIntArray(int[]arr, int x){
        return Arrays.stream(arr).anyMatch(i->i==x);
    }
    private static boolean containsStringArray(String[]arr,String str){
        return Arrays.asList(arr).contains(str);
    }
}
