import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero de 1 a 12:");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("O mes do ano é janeiro");
                break;
            case 2:
                System.out.println("O mes do ano é Fevereiro");
                break;
            case 3:
                System.out.println("O mes do ano é Março");
                break;
            case 4:
                System.out.println("O mes do ano é Abril");
                break;
            case 5:
                System.out.println("O mes do ano é Maio");
                break;
            case 6:
                System.out.println("O mes do ano é Junho");
                break;
            case 7:
                System.out.println("O mes do ano é Julho");
                break;
            case 8:
                System.out.println("O mes do ano é Agosto");
                break;
            case 9:
                System.out.println("O mes do ano é Setembro");
                break;
            case 10:
                System.out.println("O mes do ano é Outubro");
                break;
            case 11:
                System.out.println("O mes do ano é Novembro");
                break;
            case 12:
                System.out.println("O mes do ano é Dezembro");
                break;
        }
        scanner.close();
    }
}
