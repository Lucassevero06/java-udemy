package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-07-31");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-31T01:30:26");
        Instant d06 = Instant.parse("2024-07-31T01:30:26Z");

        System.out.println("----------------  d04  ------------------");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // subtrai 7 dias
        LocalDate nextWeekLocalDate = d04.plusDays(7); // adiciona 7 dias
        LocalDate pastYearLocalDate = d04.minusYears(1); // subtrai 1 ano
        LocalDate nextYearLocalDate = d04.plusYears(1); // adiciona 1 ano

        System.out.println("pastYearLocalDate = " + pastYearLocalDate);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("d04 = " + d04);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("nextYearLocalDate = " + nextYearLocalDate);

        System.out.println("----------------  d05  ------------------");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // subtrai 7 dias
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // adiciona 7 dias
        LocalDateTime pastYearLocalDateTime = d05.minusYears(1); // subtrai 1 ano
        LocalDateTime nextYearLocalDateTime = d05.plusYears(1); // adiciona 1 ano

        System.out.println("pastYearLocalDateTime = " + pastYearLocalDateTime);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("d05 = " + d05);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("nextYearLocalDateTime = " + nextYearLocalDateTime);

        System.out.println("----------------  d06  ------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // subtrai 7 dias
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // adiciona 7 dias

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("d06 = " + d06);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        System.out.println("----------------    CALCULANDO DURAÇÃO  ------------------");

        // LocalDate não tem informação de tempo (hora:minutos) por isso precisa converter para localdatetime
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); //usando o metodo atStartOfDay()
        System.out.println(t1.toDays() + " days");
        System.out.println(t1.toHours() + " hours");
        System.out.println(t1.toMinutes() + " minutes");
        System.out.println(t1.toSeconds() + " seconds");

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println(t2.toDays() + " days");
        System.out.println(t2.toHours() + " hours");
        System.out.println(t2.toMinutes() + " minutes");
        System.out.println(t2.toSeconds() + " seconds");

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println(t3.toDays() + " days");
        System.out.println(t3.toHours() + " hours");
        System.out.println(t3.toMinutes() + " minutes");
        System.out.println(t3.toSeconds() + " seconds");

        // quando se inverte a ordem do between, o resultado é negativo
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println(t4.toDays() + " days");
        System.out.println(t4.toHours() + " hours");
        System.out.println(t4.toMinutes() + " minutes");
        System.out.println(t4.toSeconds() + " seconds");

    }
}
