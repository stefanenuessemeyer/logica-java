package estruturarepeticao.emquanto;

import java.util.Scanner;

public class sintaxeEnquanto {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int numero = scanner.nextInt();


        while (numero !=0){
            numero = scanner.nextInt()
            System.out.println(numero);


        }
        scanner.close();
    }
}
