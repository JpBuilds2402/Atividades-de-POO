/*1.Exercício de Cálculo de Média: Crie um programa que solicite ao usuário três notas (números de ponto flutuante) e calcule a média aritmética das notas. Em seguida, exiba a média na tela.*/
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<Double> notas = new ArrayList<>();

        double soma = 0;
        System.out.println("Digite a quantidade de notas:");
        int qtd = scanner.nextInt();

        for (int i = 1; i<=qtd; i++){
            System.out.println("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        for (double n : notas){
            soma+= n;
        }

        double media = soma/notas.size();
        System.out.println("A média aritmética das notas é:"+ media);

        scanner.close();
    }
}