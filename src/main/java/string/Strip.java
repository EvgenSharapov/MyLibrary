package string;

public class Strip {
    public static void main(String[] args) {
        String str=" Java ";
        String str2=new String(" Java ");

        str.strip();
        str2.strip();
        str2.trim();
        System.out.println(str.length());
        System.out.println(str2.length());
    }
}
