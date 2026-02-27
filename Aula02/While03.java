import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int sorteado = gerador.nextInt(100) + 1;
        System.out.println("Resposta: "+sorteado);
        System.out.print("Tente adivinhar um valor entre 1 e 100:");
        int palpite = scanner.nextInt();
        while (palpite != sorteado){
            double diferenca = sorteado - palpite;
            if (palpite <= 0 || palpite >= 101){
                System.out.print("É um numero entre 1 e 100 seu idiota:");
                palpite = scanner.nextInt();
            }
            else {
                if (diferenca > 0){
                    System.out.println("O numero é maior que o seu palpite");
                    System.out.print("Tente outro numero:");
                    palpite = scanner.nextInt();
                }
                else {
                    System.out.println("O numero é menor que o seu palpite");
                    System.out.print("Tente outro numero:");
                    palpite = scanner.nextInt();
                }
            }
        }
        System.out.println("Parabéns acertou o numero "+sorteado);
        scanner.close();
    }
}
