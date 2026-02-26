import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro positivo para a contagem:");
        double num = scanner.nextDouble();
        while (num <= 0 || num % 1 != 0){
            System.out.print("Numero positivo e inteiro seu animal.Tenta de novo:");
            num = scanner.nextDouble();
        }
        do {
            System.out.println(num);
            num--;
        }while (num>=1);
        scanner.close();
    }
}
