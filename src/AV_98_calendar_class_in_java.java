import java.util.Calendar;

public class AV_98_calendar_class_in_java {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
    }
}
