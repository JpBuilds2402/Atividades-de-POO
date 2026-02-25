import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero  inteiro positivo:");
        int num = scanner.nextInt();
        int soma = 0;

        while(num >= 0){
            soma += num;
            System.out.print("Digite o proximo numero inteiro positivo");
            num = scanner.nextInt();
        }
        System.out.print("A soma dos numeros inteiros positivos: "+soma);
        scanner.close();
    }
}
