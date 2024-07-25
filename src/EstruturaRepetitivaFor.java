import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            System.out.println(i);
//        }

        int x = 3;
        int y = 0;

        for (int i = 0; i < x; i++) {
            System.out.print(i + ",");
            y += 5;
            System.out.println(y);
        }

    }
}
