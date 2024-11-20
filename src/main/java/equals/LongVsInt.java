package equals;

public class LongVsInt {
    public static void main(String[] args) {
        long num3=3000000000L;
        long num1=1000000000+1000000000+1000000000;
        long num2=4000000000L-1000000000;
        System.out.println(num1==num2);
        System.out.println(num3==num2);

        long num4=300000000L;
        long num5=100000000+100000000+100000000;
        long num6=400000000L-100000000;
        System.out.println(num5==num4);
        System.out.println(num6==num4);


    }
}
