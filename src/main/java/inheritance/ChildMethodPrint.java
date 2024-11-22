package inheritance;

class A{
    public void print(){
        System.out.println("A.print() is called");
    }

}
class B extends A{
    public void print(){
        System.out.println("B.print() is called");
    }
}
public class ChildMethodPrint{
    public static void main(String[] args) {
        A var=new B();
        var.print();
    }
}
