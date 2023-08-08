package questao11;

import java.util.Scanner;

public class CodigoDoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opção XXX: ");
        int opcao = scanner.nextInt();

        if (opcao == 001){
            System.out.println("Nome do produto: 00" + opcao + "? Parafuso");
        } else if (opcao == 002){
            System.out.println("Nome do produto: 00" + opcao + "? Porca");
        } else if (opcao == 003){
            System.out.println("Nome do produto: 00" + opcao + "? Prego");
        } else {
            System.out.println("Nome do produto: 00" + opcao + "? Diversos");
        }


    }
}
