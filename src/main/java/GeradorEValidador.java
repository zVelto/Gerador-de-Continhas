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
                algarismosDividendo = (3 + gerador.nextInt(2));

                if (algarismosDividendo == 3) {
                   do {
                       dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                   } while(dividendo < 600 || dividendo%10 ==0);
                } else {
                    do {
                        dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                    } while(dividendo < 3000);
                }

                break;

            case 1:
                algarismosDividendo = (4 + gerador.nextInt(3));

                if (algarismosDividendo == 4 ) {
                    do {
                        dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                    } while (dividendo < 4700);
                } else if (algarismosDividendo == 5){
                    do {
                        dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                    } while (dividendo%10 == 0);
                } else {
                    dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                }

                break;

            case 2:
                algarismosDividendo = 6 + gerador.nextInt(2);
                do {
                    dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                } while (dividendo%10 == 0);

                break;

            case 3:
                algarismosDividendo = (7 + gerador.nextInt(2));
                do {
                    dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                } while (dividendo%10 == 0);

                break;

            case 4:
                algarismosDividendo = (8 + gerador.nextInt(3));
                do {
                    dividendo = gerarNumeroPorIntervalo(algarismosDividendo);
                } while (dividendo%10 == 0);
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
                algarismosDivisor = 1;

                do {
                    divisor = gerarEValidarDivisor(algarismosDivisor);
                } while(divisor < 2 || divisor > 5);

                break;

            case 1:
                algarismosDivisor = 1;

                do {
                    divisor = gerarEValidarDivisor(algarismosDivisor);
                } while(divisor < 6);

                break;

            case 2:
                algarismosDivisor = 1;
                do {
                    divisor = gerarEValidarDivisor(algarismosDivisor);
                } while (divisor < 7);

                break;

            case 3:
                algarismosDivisor = 1 + gerador.nextInt(2);
                if(algarismosDivisor == 1) {
                    do {
                        divisor = gerarEValidarDivisor(algarismosDivisor);
                    } while (divisor < 8);
                } else {
                    do {
                        divisor = gerarEValidarDivisor(algarismosDivisor);
                    } while (divisor%10 == 0 || divisor > 20);
                }

                break;

            case 4:
                algarismosDivisor = 2;
                do {
                    divisor = gerarEValidarDivisor(algarismosDivisor);
                } while (divisor%10 == 0 || divisor > 35);

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
