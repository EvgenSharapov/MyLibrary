package string;

public class StringAscii {
    public static void main(String[] args) {
        int[]ascii={65,66,67,68,69,70};
        String str=new String(ascii,1,5);
        System.out.println(str);
    }
}
