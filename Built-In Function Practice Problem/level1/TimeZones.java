import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST

        System.out.println("GMT Time: " + gmt);
        System.out.println("IST Time: " + ist);
        System.out.println("PST Time: " + pst);
    }
}
