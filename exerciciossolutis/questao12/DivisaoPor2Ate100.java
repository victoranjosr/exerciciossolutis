package questao12;

public class DivisaoPor2Ate100 {
    public static void main(String[] args) {
        for(int i = 1; i<= 100; i++){
            if (i%3 == 0){
                System.out.println(i + " = " + (double)i/2);;
            }
        }
    }
}
