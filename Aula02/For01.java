import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        System.out.println("A tabuada de "+num+" é:");
        for (int i = 1; i <= 10; i++){
            int resultado = (num*i);
            System.out.printf("%d * %d = %d\n", num, i, resultado);
        }
        scanner.close();
    }
}
