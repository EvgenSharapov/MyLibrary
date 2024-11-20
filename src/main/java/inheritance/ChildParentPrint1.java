package inheritance;

public class ChildParentPrint1 {
    static class Parent {
        public void print(){
            System.out.println("Parent");
        }
    }
    static class Child extends Parent{
        public void print(){
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.print();

}

}
