import java.time.*;
public class DateAndTime {
    public static void main(String[] args) {
    /*LocalDate date =LocalDate.of(2024,3,31);
    int year=date.getYear();
    int month=date.getMonthValue();
    int day=date.getDayOfMonth();
    int dayOfYear=date.getDayOfYear();
    int dayOfWeek=date.getDayOfWeek().getValue();
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(dayOfYear);
    System.out.println(dayOfWeek);

    LocalDate newDate=date.withYear(2024);
    System.out.println(newDate);
    LocalDate newDate1=date.withMonth(12);
    System.out.println(newDate1);

    LocalDate plusYear=date.plusYears(2);
    System.out.println(plusYear);
    LocalDate plusMonthDate=date.plusMonths(16);
    System.out.println(plusMonthDate);
    LocalDate plusWeekDate = date.plusWeeks(2);
    System.out.println(plusWeekDate);
    LocalDate plusDaysDate = date.plusDays(10);
    System.out.println(plusDaysDate);
    LocalDate minusYear=date.minusYears(1);
    System.out.println(minusYear);
    LocalDate minusMonthDate=date.minusMonths(3);
    System.out.println(minusMonthDate);
    LocalDate minusWeekDate = date.minusWeeks(3);
    System.out.println(minusWeekDate);
    LocalDate minusDaysDate = date.minusDays(15);
    System.out.println(minusDaysDate);
*/
    LocalTime currentTimeInNewYork=LocalTime.now(ZoneId.of("Asia/Kokata"));
    System.out.println(currentTimeInNewYork);
    LocalTime time1=LocalTime.of(10,30);
    System.out.println(time1);
}
}