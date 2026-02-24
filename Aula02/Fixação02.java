/*Verificar Maior de Idade: Escreva um programa em Java que peça ao usuário que digite sua idade. Em seguida, 
o programa deve verificar se a idade é maior ou igual a 18 anos e exibir a mensagem "Você é maior de idade" caso a condição seja verdadeira, 
ou "Você é menor de idade" caso contrário.*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você é menor de idade");
        }
        scanner.close();
    }
}
