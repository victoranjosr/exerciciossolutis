package questao07;

import java.util.Scanner;

public class NumerosTrocados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int A = scanner.nextInt();

        System.out.println("Digite um valor para B: ");
        int B = scanner.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;


        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }
}
