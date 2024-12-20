package DataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhandoComDate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x1 = new Date(); // cria uma data atual
        Date x2 = new Date(System.currentTimeMillis()); // cria uma data com o horário atual

        Date y1 = sdf1.parse("25/06/2022");
        Date y2 = sdf2.parse("25/06/2022 15:42:00");
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60 * 60 * 5);

        System.out.println("x1 : " + sdf2.format(x1));
        System.out.println("x2 : " + sdf2.format(x2));
        System.out.println("x3 : " + sdf2.format(x3));
        System.out.println("x4 : " + sdf2.format(x4));

        System.out.println("y1 : " + sdf2.format(y1));
        System.out.println("y1 : " + sdf2.format(y2));

    }
}
