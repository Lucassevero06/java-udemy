package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraParaTexto {
    public static void main(String[] args) {

//        Padrões Predefinidos:
//        DateTimeFormatter.ISO_LOCAL_DATE: yyyy-MM-dd
//        DateTimeFormatter.ISO_LOCAL_TIME: HH:mm:ss
//        DateTimeFormatter.ISO_LOCAL_DATE_TIME: yyyy-MM-dd'T'HH:mm:ss
//        DateTimeFormatter.ISO_INSTANT: yyyy-MM-dd'T'HH:mm:ss.SSSXXX
//        DateTimeFormatter.ISO_OFFSET_DATE: yyyy-MM-ddXXX
//        DateTimeFormatter.ISO_OFFSET_TIME: HH:mm:ssXXX
//        DateTimeFormatter.ISO_OFFSET_DATE_TIME: yyyy-MM-dd'T'HH:mm:ssXXX
//        DateTimeFormatter.ISO_ZONED_DATE_TIME: yyyy-MM-dd'T'HH:mm:ss.SSSXXX[ZoneId]
//        DateTimeFormatter.RFC_1123_DATE_TIME: EEE, dd MMM yyyy HH:mm:ss z
//        DateTimeFormatter.BASIC_ISO_DATE: yyyyMMdd

        LocalDate d04 = LocalDate.parse("2024-07-31");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-31T01:30:26");

        // o instant não tem acesso ao metodo format()
        Instant d06 = Instant.parse("2024-07-31T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // especificando o timezone
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(java.time.ZoneId.systemDefault());// cria objeto de formatação com um padrão e considera o fuso horario do sistema local da maquina
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        // formas de usa o formatter, o resultado é o mesmo
        System.out.println(d04.format(fmt1));
        System.out.println(fmt1.format(d04));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(fmt1));
        System.out.println(d05.format(fmt2));
        System.out.println(d05.format(fmt4));

        //System.out.println(fmt2.format(d06)); // aqui retornará um erro, pois o ftm2 não está configurado para o fuso horário
        System.out.println(fmt3.format(d06));

        System.out.println(fmt5.format(d06));


    }
}
