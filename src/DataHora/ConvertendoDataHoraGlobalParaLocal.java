package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class ConvertendoDataHoraGlobalParaLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-07-31");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-31T01:30:26");

        // o instant não tem acesso ao metodo format()
        Instant d06 = Instant.parse("2024-07-31T01:30:26Z"); // horario de londres

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // converte o instant para uma data local, considerando o fuso horario do computador
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // converte o instant para uma data local, considerando o fuso horario de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(r1); // exibindo o fuso horario do computador
        System.out.println(r2); // exibindo o fuso horario de Portugal
        System.out.println(r3); // exibindo o fuso horario do computador
        System.out.println(r4); // exibindo o fuso horario de Portugal

        System.out.println(d04.getDayOfMonth()); // o dia atual do mes em int
        System.out.println(d04.getMonth()); // o mes atual em string
        System.out.println(d04.getMonthValue()); // o mes atual em int
        System.out.println(d04.getDayOfWeek()); // o dia atual da semana em string
        System.out.println(d04.getDayOfYear()); // o dia atual do ano em int
        System.out.println(d04.getYear()); // o ano atual em int

        System.out.println(d05.getHour()); // exibe a hora em int
        System.out.println(d05.getMinute()); // exibe o minuto em int
        System.out.println(d05.getSecond()); // exibe o segundo em int

        // exibindo o nome de cada timezone, existem +600
        //for (String s : ZoneId.getAvailableZoneIds()) {
        //    System.out.println(s);
        //}

    }
}
