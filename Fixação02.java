/*2.Exercício de Conversão de Temperatura: Crie um programa que peça ao usuário para digitar uma temperatura em graus Celsius e converta-a para Fahrenheit. Em seguida, exiba o resultado na tela.*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite uma Temperatura em Celsius:");
        double tempC = scanner.nextDouble();
        double tempF = (tempC*1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é"+ tempF);
        scanner.close();
    }
}
