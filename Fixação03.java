/*3.Exercício de Concatenação de Strings: 
Peça ao usuário que digite seu nome e sobrenome separadamente (duas strings). 
Em seguida, concatene os dois valores para formar o nome completo e exiba-o na tela.*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu primeiro nome:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o seu segundo nome");
        String nome2 = scanner.nextLine();
    System.out.println("Seu nome completo é "+ nome1 +" "+ nome2);
    }
}
