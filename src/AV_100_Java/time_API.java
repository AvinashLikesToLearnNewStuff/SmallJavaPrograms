package AV_100_Java;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class time_API {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + t);

        LocalTime t1= t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t1);

    }
}
