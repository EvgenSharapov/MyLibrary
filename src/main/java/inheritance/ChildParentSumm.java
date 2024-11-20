package inheritance;

class ChildParentSum{
    static int x=1;
    public ChildParentSum(){
        x+=2;}
}
class Child extends ChildParentSum {
    public Child() {
        x += 1;
    }


    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(x);

    }
}