package stream;
import java.util.TreeMap;

public class StreamHeadMapTailMap {
        public static void main(String[] args) {
            TreeMap<Integer,String> treeMap=new TreeMap<>();
            treeMap.put(5,"Java");
            treeMap.put(10,"Python");
            treeMap.put(15,"Kotlin");
            treeMap.put(20,"Go");
            treeMap.put(25,"JavaScript  ");
            System.out.println(sumKey(treeMap));
            System.out.println(getLanguagesTail(treeMap,10));
    }
    //выводит конкатенацию значений после ключа k
    private static String getLanguagesTail(TreeMap<Integer, String> treeMap,int k) {
       return treeMap.tailMap(k).values().stream().reduce("go:",String::concat);
    }

    //суммирует все ключи до значения
    private static int sumKey(TreeMap<Integer,String>map){
       return map.headMap(15).keySet().stream().reduce(0,Integer::sum);
    }
}
