package collections.map;

import java.util.Map;

public class MapSwitchCase {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(ifElse("book"));
        System.out.println(ifElse("pen"));
        System.out.println(ifElse("laptop"));
        System.out.println(ifElse("bookss"));
        System.out.println(ifElse("book"));
        System.out.println(ifElse("pen"));
        System.out.println(ifElse("laptop"));
        System.out.println(ifElse("bookss"));
        System.out.println(System.currentTimeMillis() - time);
        Map<String, String> discounts = Map.of("book", "10%", "pen", "5%", "laptop", "15%");
        long time1 = System.currentTimeMillis();
        System.out.println(mapStart(discounts,"laptop"));
        System.out.println(System.currentTimeMillis() - time1);
    }

    private static String ifElse(String product){

        if("book".equals(product)){
            return "10%";
        } else if("pen".equals(product)){
            return "15%";
        }else if("laptop".equals(product)){
            return "20%";
        }else return "No discount";
    }
    private static String mapStart(Map<String, String> discounts,String product){
        return discounts.getOrDefault(product, "No discount");
    }
}
