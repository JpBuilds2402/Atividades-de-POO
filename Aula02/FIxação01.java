/*Verificar Par ou Ímpar: Escreva um programa em Java que solicite ao usuário que digite um número inteiro. 
Em seguida, o programa deve verificar se o número é par ou ímpar e exibir a mensagem correspondente na tela.*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero:");
        double num = scanner.nextDouble();
        if(num % 2 == 0){
            System.out.println("O numero "+num+" é par");
        }
        else {
            System.out.println("O numero "+num+" é impar");
        }
        scanner.close();
    }
}
