import entidade1.Pessoa;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Pessoa Nº " + i + ":");
            System.out.print("Digite o seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            listaPessoas.add(new Pessoa(nome, idade));
        }
        double somaIdades = 0;
        int maiorIdade = 0;
        int menorIdade = 1000;
        int contagemMaiores = 0;

        for (Pessoa p: listaPessoas) {
            somaIdades += p.idade;

            if (p.idade >= maiorIdade) {
                maiorIdade = p.idade;
            }
            if (p.idade < menorIdade){
                menorIdade = p.idade;
            }
            if (p.idade >= 18){
                contagemMaiores++;
            }
        }
        double media = somaIdades/ listaPessoas.size();

        System.out.println("A media das idades é "+media);
        System.out.println("A maior idade é "+maiorIdade);
        System.out.println("A menor idade é "+menorIdade);
        System.out.println("A quantidade de pessoas maiores de idade é "+contagemMaiores);
        scanner.close();
    }
}
