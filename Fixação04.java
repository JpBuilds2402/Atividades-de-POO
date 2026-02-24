/*4.Exercício de Contagem de Caracteres: 
Crie um programa que solicite ao usuário que digite uma frase (uma string). 
Em seguida, conte o número de caracteres (incluindo espaços) na frase e exiba o resultado na tela.*/
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
