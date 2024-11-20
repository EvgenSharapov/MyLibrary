package collections.list;

import java.util.ArrayList;
import java.util.List;

public class FinalListAddElement {
    public static void main(String[] args) {
        final List<String>list=new ArrayList<>();//ссылка на обьект не изменяема,обьект изменить можно
        list.add("Java is");
        list.add("The Best!");
        System.out.println(list);
    }
}
