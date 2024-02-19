package goout;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateClass {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before Format: "+now);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");

        System.out.println("After Format: "+ now.format(df));
    }
}
