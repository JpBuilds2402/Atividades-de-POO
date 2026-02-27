import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Contagem iniciando");
        for (int i = 10; i >= 0 ; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
        }
        scanner.close();
    }
}
