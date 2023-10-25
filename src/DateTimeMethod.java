package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMethod {
    static public String getDateTime() {
                LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTime = dateTime.format(formattedDateTime);
        return currentDateTime;
    }
}
