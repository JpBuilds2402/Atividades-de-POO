import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random gerador = new Random();
        int sorteado = gerador.nextInt(100) + 1;
        System.out.println("Resposta: "+sorteado);
        System.out.print("Tente adivinhar um valor entre 1 e 100:");
        int palpite = scanner.nextInt();
        while (palpite != sorteado){
            if (palpite <= 0 || palpite >= 101){
                System.out.print("É um numero entre 1 e 100 seu idiota:");
                palpite = scanner.nextInt();
            }
            else {
                System.out.print("Tente outro numero:");
                palpite = scanner.nextInt();
            }
        }
        System.out.println("Parabéns acertou o numero "+sorteado);
        scanner.close();
    }
}
