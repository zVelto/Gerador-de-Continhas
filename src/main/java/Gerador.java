import java.util.Random;

public class Gerador {

    public static Random gerador = new Random();

    public static void validaDivisor(int divisor, int dificuldade) {

    }

    public static int gerarDividendo(Intervalo inter) {

        return inter.getNumMin() + gerador.nextInt(inter.bound());

    }

    public static int gerarDivisor(Intervalo inter) {

        return inter.getNumMin() + gerador.nextInt(inter.bound());

    }
}
