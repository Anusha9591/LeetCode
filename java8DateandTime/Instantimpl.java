package java8DateandTime;

import java.time.Instant;

public class Instantimpl {

    public static void main(String[] args) {
        long currentTimeMillis=System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Instant now=Instant.now();
        System.out.println(now);
    }
}
