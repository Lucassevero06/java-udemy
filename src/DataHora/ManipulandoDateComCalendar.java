package DataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoDateComCalendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE); //extraindo os minutos da data e armazenando em uma variável
        int month = 1 + cal.get(Calendar.MONTH); // quando se quer o mes, é necessario sempre adicionar + 1, pois o mes comeca em 0, janeiro é o mes 0, e dezembro é o mes 11

        System.out.println("minutes: " + minutes);
        System.out.println("month: " + month);

//        cal.add(Calendar.HOUR_OF_DAY, 4);
//        d = cal.getTime();
//        System.out.println(sdf.format(d));
    }
}
