package time;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalTime openingHrs = LocalTime.of(11,0);
        LocalTime closingHrs = LocalTime.of(22, 0);
        System.out.println("The restaurent is open from " + openingHrs + " to " + closingHrs + " on every day");
        LocalDate orderDate = LocalDate.now().minusDays(3);
        System.out.println(orderDate);

        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println(orderDateTime);

        LocalTime deliveryTime = LocalTime.of(1, 10);
        System.out.println(deliveryTime);
        LocalDateTime estimatedDeliveryDateTime = orderDateTime.plusHours(deliveryTime.getHour())
                .plusMinutes(deliveryTime.getMinute());
        System.out.println(estimatedDeliveryDateTime);
        LocalDateTime realDeliveryDateTime = orderDateTime.plusMinutes(90);
        System.out.println(realDeliveryDateTime);


        long diffrenceBetweenEstimatedAndReal = ChronoUnit.MINUTES.between(estimatedDeliveryDateTime, realDeliveryDateTime);
        System.out.println("Diffrence" + diffrenceBetweenEstimatedAndReal + "in Minutes");

        if(estimatedDeliveryDateTime.isBefore(realDeliveryDateTime)) {
            System.out.println("Delivert in time");
        } else {
            System.out.println("Delivery late");
        }

        HijrahDate hijrahDate = HijrahDate.from(orderDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd");

        System.out.println(dateTimeFormatter.format(hijrahDate));
        ZonedDateTime zonedDateTime = orderDateTime.atZone(ZoneId.of("Europe/Budapest"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime1);
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }

    }
}
