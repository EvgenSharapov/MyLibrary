package pattern.regexp;

public class StringFormat04d {
    public static void main(String[] args) {
        String s=String.format("%05d",7);//добавление 0
        System.out.println(s);
        s=String.format("%2.5d",722222333);//добавление 0
        System.out.println(s);
        s=String.format("%1$.4s",55533333);//обрезание
        System.out.println(s);

    }
}
