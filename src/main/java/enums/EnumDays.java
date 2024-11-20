package enums;

public class EnumDays {
    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATYRDAY,SUNDAY;
    }

    public static void main(String[] args) {
        Day today;
        try{
            today=Day.valueOf("friday");
        } catch (IllegalArgumentException e) {
            today=Day.MONDAY;
        }
        switch (today){
            case MONDAY,TUESDAY -> System.out.println("Weekday");
            case SATYRDAY,SUNDAY -> System.out.println("Weekend");
            default -> System.out.println("Midweek");
        }
    }
}
