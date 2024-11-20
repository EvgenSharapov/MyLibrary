package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePattern {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        String formatedDateTime=dateTime.format(DateTimeFormatter.ofPattern(getPattern(4)));

        System.out.println(formatedDateTime);

    }

    private static String getPattern(int i) {
        switch (i){
            case 1->   {return "dd-MM-yyyy hh:mm";}
            case 2->    {return "d-m-y h:m";}
            case 3->    {return "d-M-y HH:mm";}
            default -> {return "d-M-yyyy H:mm";}
            }
        }
}
