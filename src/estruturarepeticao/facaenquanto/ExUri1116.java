package estruturarepeticao.facaenquanto;

import java.util.Scanner;

public class ExUri1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i <= n; i++) {

            double dividido = (double) x / y;

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(dividido);
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
