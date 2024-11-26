package interfaceTest.lambda;


import java.util.concurrent.atomic.AtomicInteger;

public class InterfaceFunctionalLambda {
    public static void main(String[] args) {
        AtomicInteger i= new AtomicInteger(4);
        MyFunctionalInterface myFunction = () -> {
            System.out.println("Doing something!");
            System.out.println("Java");
            i.set(5);
        };


        myFunction.doSomething();
        System.out.println(i.get()+1);// Вызов метода
    }
}
