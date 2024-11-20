package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String str = "datadata datat dataa datas datad";
        Pattern p = Pattern.compile("(data){2}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
        p = Pattern.compile("data{2}");
        m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
        int a=3;
        System.out.println(a<<2);

    }



}
