import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i =0; i <= 100; i++){
            if (i % 2 == 0){
                soma += i;
                System.out.println(soma);
            }
        }
        scanner.close();
    }
}
