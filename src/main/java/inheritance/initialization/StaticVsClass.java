package inheritance.initialization;

public class StaticVsClass {
    static int i=0;
    public static void main(String[] args) {
        System.out.println(i);
    }
    static {i=1;}
}
