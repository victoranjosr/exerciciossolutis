package questao14;

import java.util.Scanner;

public class While50Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        while(contador < 50){
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            soma += numero;
            contador += 1;

        }

        double divisao = (double) soma/contador;

        System.out.println(divisao);
    }
}
