package collections.treeMap;

import java.util.TreeMap;

public class TreeMapSumKey {
    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        treeMap.put(5,"Java");
        treeMap.put(10,"Python");
        treeMap.put(15,"Kotlin");
        treeMap.put(20,"Go");
        treeMap.put(25,"JavaScript  ");

        int sumKey=treeMap.headMap(15).keySet().stream().reduce(0,Integer::sum);
        String languages=treeMap.tailMap(10).values().stream().reduce("go:",String::concat);
        System.out.println("Sum of keys: "+sumKey);
        System.out.println("Concatenated languages: "+languages);

    }
}
