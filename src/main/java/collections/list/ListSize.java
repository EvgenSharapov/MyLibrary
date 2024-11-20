package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListSize {
    static public void goMethod(){

    }
    public static void main(String[] args) {
        List list = new ArrayList<Long>();
        list.add(1L);
        list.add(0);
        list.add(new Object());
        list.add("I'm long!");

        System.out.println(list.size());



    }


}
