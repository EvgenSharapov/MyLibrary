package operators;

public class DoubleIncrement {
    public static void main(String[] args) {
        int i,j;

        i=10;
        j=20;

        while (++i<--j){
            System.out.println(i);
        }
    }
}
