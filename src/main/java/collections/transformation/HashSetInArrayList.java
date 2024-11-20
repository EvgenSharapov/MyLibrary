package collections.transformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetInArrayList {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("Гоголь");
        hashSet.add("Пушкин");
        ArrayList<String>arrayList=new ArrayList<>(hashSet);
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
