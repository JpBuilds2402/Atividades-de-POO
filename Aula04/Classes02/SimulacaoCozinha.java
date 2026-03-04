import java.util.Locale;
import java.util.Scanner;
import Classes02.PopulacaoBaratas;

public class SimulacaoCozinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        PopulacaoBaratas cozinha = new PopulacaoBaratas();
        System.out.println("Na cozinha tem:"+cozinha.getNumeroBaratas());

        cozinha.aumentarBaratas(2);
        System.out.println("As baratas se reproduziram e agora tem 2 vezes mais baratas que antes:"+cozinha.getNumeroBaratas());

        cozinha.spray();
        System.out.println("Depois de passar spray agora tem:"+cozinha.getNumeroBaratas());

        cozinha.aumentarBaratas(3);
        System.out.println("As baratas se reproduziram e agora tem 3 vezes mais baratas depois do spray:"+cozinha.getNumeroBaratas());

        scanner.close();
    }
}





