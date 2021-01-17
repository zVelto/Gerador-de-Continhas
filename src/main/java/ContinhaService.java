import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContinhaService {

    private List<Continha> list = new ArrayList<>();

    public ContinhaService() {
    }

    public void GerarLista(int dificuldade, int numContinhas) {

        int ADD;
        int ADR;

        for(int i = 0; i < numContinhas; i++) {

            Random gerador = new Random();
            int algarismosDividendo;
            int algarismosDivisor;

            switch(dificuldade) {
                case 0:
                    ADD = (2 + gerador.nextInt(3));
                    algarismosDividendo = geradorDividendo(ADD);
                    ADR = 1;
                    algarismosDivisor = geradorDivisor(ADR);
                break;

                case 1:
                    ADD = (4 + gerador.nextInt(3));
                    algarismosDividendo = geradorDividendo(ADD);
                    ADR = 1;
                    algarismosDivisor = geradorDivisor(ADR);
                break;

                case 2:
                    ADD = 6 + gerador.nextInt(2);
                    algarismosDividendo = geradorDividendo(ADD);
                    ADR = 1 + gerador.nextInt(2);
                    algarismosDivisor = geradorDivisor(ADR);
                break;

                case 3:
                    ADD = (7 + gerador.nextInt(2));
                    algarismosDividendo = geradorDividendo(ADD);
                    ADR = 2 + gerador.nextInt(2);
                    algarismosDivisor = geradorDivisor(ADR);
                break;

                default:
                    ADD = (8 + gerador.nextInt(3));
                    algarismosDividendo = geradorDividendo(ADD);
                    ADR = 3;
                    algarismosDivisor = geradorDivisor(ADR);
            }

            list.add(new Continha(algarismosDividendo, algarismosDivisor));
        }
    }

    public void imprimirLista() {
        for (Continha c: list) {
            System.out.println(c);
        }
    }

    public int geradorDividendo(int algarismosDividendo) {
        Random gerador = new Random();
        return (int) (Math.pow(10, algarismosDividendo - 1) + gerador.nextInt((int) ((int) Math.pow(10, algarismosDividendo) - (Math.pow(10, algarismosDividendo - 1)))));
    }

    public int geradorDivisor(int algarismosDivisor) {

        Random gerador = new Random();

        int divisor;

        do {
            divisor = (int) Math.pow(10, algarismosDivisor - 1) + gerador.nextInt((int) (Math.pow(10, algarismosDivisor) - Math.pow(10, algarismosDivisor - 1)));

        }while (divisor == 0 || divisor == 1);

        return divisor;
    }

    public List<Continha> getList() {
        return list;
    }

}
