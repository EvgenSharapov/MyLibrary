package inheritance;

public class SuperSubStatic {
    static String ID="QBANK";
}
class Sub extends SuperSubStatic{
    static {
        System.out.println("In Sub");
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
