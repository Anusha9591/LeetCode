package java8DateandTime;

public class LocalDate {

    public static void main(String[] args) {
        java.time.LocalDate now = java.time.LocalDate.now();
        System.out.println(now);
        java.time.LocalDate customDate = java.time.LocalDate.of(1990, 2, 7);
        java.time.LocalDate yesterday = now.minusDays(1);
        java.time.LocalDate pastDate = now.minusMonths(100);
        System.out.println(yesterday);
        System.out.println(pastDate);
    }

}
