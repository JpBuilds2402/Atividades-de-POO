import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero de 1 a 7:");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("O dia da semana é Domingo");
                break;
            case 2:
                System.out.println("O dia da semana é Segunda-Feira");
                break;
            case 3:
                System.out.println("O dia da semana é Terça-Feira");
                break;
            case 4:
                System.out.println("O dia da semana é Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia da semana é Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia da semana é Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia da semana é Sabado");
                break;
        }
        scanner.close();
    }
}
