package print;

public class FinalPrint {
    public static void main(String[] args) {
       final int a=1,b=5;
        for(int i=0;a<b;i++){
            System.out.println("Hello");
        }

      /*System.out.println("Hi");ошибка компиляции с final  */
    }
}
