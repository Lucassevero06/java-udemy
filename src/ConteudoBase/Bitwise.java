import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

//        int n1 = 89;
//        int n2 = 60;
//
//        System.out.println(n1 & n2);
//        System.out.println(n1 | n2);
//        System.out.println(n1 ^ n2);

        Scanner sc = new Scanner(System.in);

//      int mask = 0b00100000;
        int mask = 32; // 0010 0000
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit é verdadeiro");
        } else {
            System.out.println("6th bit é falso");
        }

    }
}
