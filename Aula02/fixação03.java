/* Cálculo de Bônus Salarial: Escreva um programa em Java que solicita ao usuário que digite o valor do salário mensal. 
O programa deve calcular o bônus salarial de acordo com a seguinte regra: 
se o salário for menor ou igual a R$ 1000, o bônus será de 10% do salário; caso contrário, o bônus será de 5% do salário. 
Em seguida, exiba o valor do bônus na tela.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor do seu salário mensal:");
        double salario = scanner.nextDouble();
        double salariobonus = 0;

        if(salario <= 1000){
            salariobonus = salario + (salario*0.1);
            System.out.println("O seu salário mensal com um bonus de 10% é "+salariobonus);
        }
        else {
            salariobonus = salario + (salario*0.05);
            System.out.println("O seu salário mensal com um bonus de 5% é "+salariobonus);
        }
        scanner.close();
    }
}
