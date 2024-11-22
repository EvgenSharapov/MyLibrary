package inheritance.initialization;


class One{
    public static void print(int i){
        System.out.println("One");
    }
}
class Two extends One{
    public static void print(int b){
        System.out.println("Two");
    }
}


public class ParentChildStaticMethod {
    public static void main(String[] args) {
       One one=new Two();
        one.print(10);
    }
}
