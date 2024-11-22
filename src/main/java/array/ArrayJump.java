package array;

public class ArrayJump {
    public static void main(String[] args) {
        int[] arrayOne = {1, 4, 6, 0, 2, 5};
        int[] arrayTwo = {2, 3, -1, 1, 3, 1, 1, 1};
        int[] arrayThree = {1, 4, 6, 7};
        int[]arrayFour={0,3};
        int[]arrayFive={1,-1,3,3,8};
        System.out.println("arrayOne:"+arrayJumpLastElement(arrayOne));
        System.out.println("arrayTwo:"+arrayJumpLastElement(arrayTwo));
        System.out.println("arrayThree:"+arrayJumpLastElement(arrayThree));
        System.out.println("arrayFour:"+arrayJumpLastElement(arrayFour));
        System.out.println("arrayFive:"+arrayJumpLastElement(arrayFive));

    }

    private static boolean arrayJumpLastElement(int[] arr) {
        if(arr[0]==0&&arr.length!=1){return false;}
        int countAction=0;
        for (int i = 0; i < arr.length; ) {
            if (i == arr.length - 1) {
                return true;
            }
            i += arr[i];
            if ((i < arr.length-1&&(i += arr[i])>=0)) {
                countAction++;
                if (countAction > arr.length - 1) {
                    System.out.print("Бесконечный цикл:");
                    return false;
                }

            }
        }
        return false;
    }
}
