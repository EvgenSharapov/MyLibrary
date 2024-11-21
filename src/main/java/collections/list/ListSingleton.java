package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSingleton {
    public static void main(String[] args) {
        final List<String>list1=new ArrayList<>(Collections.singleton("Hello World!"));//изменяемый лист с одним элементом
        final List<String>list2=Collections.singletonList("  Hello World!  ");//неизменяемый лист с одним элементом

        list1.set(0,list1.get(0).toUpperCase());
        System.out.println(list1.get(0));

        //list2.set(0,list2.get(0).toUpperCase());
        //list2.set(0,list2.get(0).trim());

        System.out.println(list2.get(0));
    }
}
