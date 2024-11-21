package array;

import java.util.Arrays;

public class ArrayMoveZero {
    public static void main(String[] args) {
        int[]array=new int[]{1,3,0,7,0,2,0,10,5};
        int[]arrayZero=new int[]{0};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayZero));
        System.out.println(Arrays.toString(moveZeroOne(array)));
        System.out.println(Arrays.toString(moveZeroOne(arrayZero)));
        moveZeroTwo(array);
        System.out.println(Arrays.toString(array));
        moveZeroTwo(arrayZero);
        System.out.println(Arrays.toString(arrayZero));

    }
    private static int[] moveZeroOne(int[]arr){
        if(arr.length==0){return arr;}
        int[]temp=new int[arr.length];
        int i=0;
        for(int x=0;x<temp.length;x++){
            if(arr[x]!=0){temp[i]=arr[x];i++;}
        }
        return temp;
    }
    private static void moveZeroTwo(int[]arr){

        int countNotZero=0;
        int countZero=0;
        int length=arr.length;

        while (countZero<length){
            if(arr[countZero]==0){
                countZero++;
            }
            else{
                arr[countNotZero++]=arr[countZero++];
            }
        }
        while (countNotZero<length){
            arr[countNotZero++]=0;
        }
    }
}
