package array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]array=new int[]{1,4,6,9,11,13,16};
        System.out.print(searchElement(array,10));
    }
    private static String searchElement(int[] i,int elem){
    int position= Arrays.binarySearch(i,elem);
    if(~position>=1){return "There is no such element";}
    else{
    return "Element has to be inserted at: "+ -(~position);}
    }
}
