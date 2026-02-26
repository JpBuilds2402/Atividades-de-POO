import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String senha = "senha123";
        String palpite;
        do {
            System.out.print("Digite a senha:");
            palpite = scanner.next();
            if (!palpite.equals(senha)){
                System.out.println("Senha invalida.Tente Novamente");
            }
            else {
                System.out.println("Login efetuado");
            }
        }while (!palpite.equals(senha));
        scanner.close();
    }
}
