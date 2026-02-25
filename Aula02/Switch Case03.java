import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero de 1 a 3:");
        int num = scanner.nextInt();
        double valor = 1000;
        double valordes = 0;
        switch (num) {
            case 1:
                valordes = valor - (valor*0.1);
                System.out.println("O valor do desconto é de 10%: "+valordes);
                break;
            case 2:
                valordes = valor - (valor*0.2);
                System.out.println("O valor do desconto é de 20%: "+valordes);
                break;
            case 3:
                valordes = valor - (valor*0.3);
                System.out.println("O valor do desconto é de 30%: "+valordes);
                break;
        }
        scanner.close();
    }
}
