package other;

public class TestSequenceLoop {
    static boolean foo(char c){
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i=0;
        for(foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');
        }
        int a=5;
        float b=2.5f;
        System.out.println("\n"+a/b);

    }
}
