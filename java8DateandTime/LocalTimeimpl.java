package java8DateandTime;

import java.time.LocalTime;

public class LocalTimeimpl {
    public static void main(String[] args) {
        LocalTime now= LocalTime.now();
        LocalTime customTime = LocalTime.of(14, 30, 30);
        String timeInString = "15:30:45";
        LocalTime parsedTime = LocalTime.parse(timeInString);
        LocalTime BeforeOneHour = now.minusHours(1);

    }




}
