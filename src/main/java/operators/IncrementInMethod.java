package operators;

public class IncrementInMethod {
    public static void main(String[] args) {
        int i=10;
        increment(i);
        System.out.println(i);//10

    }
    private static void increment(int i){
        i=i+1;
    }
}
