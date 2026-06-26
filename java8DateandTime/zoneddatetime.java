package java8DateandTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class zoneddatetime {
    public static void main(String[] args) {
        ZonedDateTime now= ZonedDateTime.now();
        System.out.println(now);
        Set<String> availableZoneIds= ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);
        ZonedDateTime newYorkTime = ZonedDateTime.of(2000, 12, 1, 14, 30, 30, 30, ZoneId.of("America/New_York"));
        System.out.println(newYorkTime);
    }

}
