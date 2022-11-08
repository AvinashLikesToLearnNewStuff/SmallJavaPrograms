import java.util.Calendar;

public class AV_99_calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":"+ c.get(Calendar.MINUTE));


    }

}
