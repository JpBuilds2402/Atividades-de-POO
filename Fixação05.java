/*5.Exercício de Cálculo de Área de um Círculo: 
Peça ao usuário que digite o raio de um círculo (número de ponto flutuante). 
Em seguida, calcule a área do círculo usando a fórmula A = π * r^2, onde π (pi) é uma constante aproximada de 3.14159. 
Exiba a área na tela.*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o raio do circulo que vc quer calcular a area:");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio*raio);
        System.out.println("A area do circulo é "+area);
        scanner.close();
    }
}
