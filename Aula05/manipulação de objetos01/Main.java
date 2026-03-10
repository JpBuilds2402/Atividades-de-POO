package POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Pessoa p1 = new Pessoa("João", 19,"Vila Velha");
        Pessoa p2 = new Pessoa("Caio", 23,"Jabaeté");
        Pessoa p3 = new Pessoa("Danilo", 99,"CidadeDeDeus");

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();

        System.out.println("Atualizado");

        p1.setCidade("Vitoria");

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();

        scanner.close();
    }
}





