package questao10;

public class DivisaoEntre6E4 {
    public static void main(String[] args) {

        int primeira = 6;
        int segunda = 4;
        int terceira = primeira/segunda;

        System.out.println(terceira);

    }
}
/* O resultado correto é 1,25 mas a divisão entre dois inteiros no Java resulta em um valor inteiro, sempre resultando
na parte inteira. Portanto ele retorna o valor 1 como resultado. */