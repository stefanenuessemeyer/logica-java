package estruturarepeticao.enquanto;

import java.util.Scanner;
/*
escrever um programa que leia numeros inteiros ate que seja digitado zero
ao final somar todos os numeros digitados
 */



public class sintaxeEnquanto {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int numero = scanner.nextInt();
        int auxiliar = 0;

        while (numero !=0){
            auxiliar = auxiliar + numero;
            numero = scanner.nextInt();


            System.out.println("total" + auxiliar );


        }
        scanner.close();
    }
}
