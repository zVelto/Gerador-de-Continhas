import java.util.Random;

public class GeradorEValidador {

    public static Random gerador = new Random();

    public static void validaDivisor(int divisor, int dificuldade) {

    }

    public static int gerarDividendo(int dificuldade) {

        int algarismosDividendo;
        int dividendo;

        switch(dificuldade) {
            case 0:
                algarismosDividendo = (2 + gerador.nextInt(3));
                dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                break;

            case 1:
                algarismosDividendo = (4 + gerador.nextInt(3));
                dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                break;

            case 2:
                algarismosDividendo = 6 + gerador.nextInt(2);
                dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                break;

            case 3:
                algarismosDividendo = (7 + gerador.nextInt(2));
                dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                break;

            case 4:
                algarismosDividendo = (8 + gerador.nextInt(3));
                dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                break;

            default:
                dividendo = 0;
        }

        return dividendo;
    }

    public static int gerarDivisor(int dificuldade) {

        int algarismosDivisor;
        int divisor;

        switch(dificuldade) {
            case 0:

            case 1:
                algarismosDivisor = 1;
                divisor = gerarEValidarDivisor(algarismosDivisor);
                break;

            case 2:
                algarismosDivisor = 1 + gerador.nextInt(2);
                divisor = gerarEValidarDivisor(algarismosDivisor);
                break;

            case 3:
                algarismosDivisor = 2 + gerador.nextInt(2);
                divisor = gerarEValidarDivisor(algarismosDivisor);
                break;

            case 4:
                algarismosDivisor = 3;
                divisor = gerarEValidarDivisor(algarismosDivisor);
                break;

            default:
                divisor = 1;
        }

        return divisor;
    }

    public static int gerarNumeroPorIntervalo(int numAlgarismo) {
        int baseDosLimites = (int) Math.pow(10, numAlgarismo - 1);
        return gerador.nextInt(baseDosLimites * 9) + baseDosLimites;
    }

    public static int gerarEValidarDivisor(int numAlgarismo) {
        int num;

        do {
            num = gerarNumeroPorIntervalo(numAlgarismo);
        } while(num == 0 || num == 1);

        return num;
    }

}
