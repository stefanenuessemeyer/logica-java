package estruturarepeticao.para;

import java.util.Scanner;

public class ExUri1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();;
        for (int i = 0; i < n; i++) {

            if (x == 0) {
                System.out.println("NULL/n");
            } else {
                if (x > 0) {
                    System.out.println("POSITIVO");
                } else {
                    System.out.println("NEGATIVO");
                }
                if (x % 2 == 0) {
                    System.out.println("EVEM");
                } else {
                    System.out.println("ODD");
                }
                x = scanner.nextInt();
            }
        }
        scanner.close();
    }
}