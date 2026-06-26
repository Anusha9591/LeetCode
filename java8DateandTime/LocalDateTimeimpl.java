package java8DateandTime;

import java.time.LocalDateTime;

public class LocalDateTimeimpl {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime parse = LocalDateTime.parse("2023-01-11T13:48");
        System.out.println(parse);


    }
}
