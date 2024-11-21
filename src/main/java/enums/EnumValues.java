package enums;

public class EnumValues {
    public static void main(String[] args) {
        System.out.println(Values.A);
    }
}
enum Values{
    A(1),B(2),C(3);//первым инициализируется конструктор enum
    Values(int i){
        System.out.println(i);
    }
    static {
        System.out.println("static");
    }
}
