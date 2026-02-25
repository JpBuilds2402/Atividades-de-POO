import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero positivo:");
        int numf = scanner.nextInt();
        int num = 1;

        while(num <= numf){
            System.out.println(num);
            num++;

        }
        scanner.close();
    }
}
