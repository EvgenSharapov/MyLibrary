package other;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        String strong="hello";
        String strong2=new String("hello2");
        String strong3="hello3";
        String strong4=new String("hello4");
        WeakReference<String>weak1=new WeakReference<>(strong);
        WeakReference<String>weak2=new WeakReference<>(strong2);
        WeakReference<String>weak3=new WeakReference<>(strong3);
        WeakReference<String>weak4=new WeakReference<>(strong4);
        System.out.println(weak1.get());
        System.out.println(weak2.get());
        System.out.println(weak3.get());
        System.out.println(weak4.get());
        strong=null;
        strong2=null;
        strong3=null;
        strong4=null;
        System.gc();
        System.out.println(weak1.get());
        System.out.println(weak2.get());
        System.out.println(weak3.get());
        System.out.println(weak4.get());
    }
}
