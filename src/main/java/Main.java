import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas continhas deverão ser geradas? ");
        int numContinhas = scan.nextInt();
        System.out.print("Qual a dificuldade? ");
        int dificuldade = scan.nextInt();

        ContinhaService service = new ContinhaService();
        service.GerarLista(dificuldade, numContinhas);
        service.imprimirLista();
    }
}
