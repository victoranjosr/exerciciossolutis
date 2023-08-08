package questao15;

import java.util.Scanner;

public class DoWhile50Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            soma += numero;
            contador += 1;
        } while (contador < 50);

        double divisao = (double) soma / contador;

        System.out.println(divisao);
    }
}
