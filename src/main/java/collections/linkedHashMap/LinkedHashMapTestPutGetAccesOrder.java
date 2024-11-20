package collections.linkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTestPutGetAccesOrder {
    public static void main(String[] args) throws Exception {
        Map<String,Integer>map=new LinkedHashMap<>(16,0.75f,true);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.get("one");
        map.get("three");
        for(String s: map.keySet()){
            System.out.print(s+" ");
        }
    }
}
