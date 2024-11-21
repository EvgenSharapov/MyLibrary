package equals;

public class IntegerValueOf {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        Integer d=new Integer(100);
        int e=100;
        Integer c= Integer.valueOf(100);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(d==a);
        System.out.println(e==a);
        System.out.println(e==d);
        System.out.println(e==c);
    }
}
