import java.util.Random;

public class Continha {

    private int dividendo;
    private int divisor;
    private int resto;
    private int algarismosDividendo;
    private int algarismosDivisor;

    public Continha(int algarismosDividendo, int algarismosDivisor, int resto) {
        this.algarismosDividendo = algarismosDividendo;
        this.algarismosDivisor = algarismosDivisor;
        this.resto = resto;
    }

    public int generateDividendo() {
        Random gerador = new Random();
        return (int) (Math.pow(10, algarismosDividendo - 1) + gerador.nextInt((int) Math.pow(10, algarismosDividendo)));
    }

    public int getAlgarismosDividendo() {
        return algarismosDividendo;
    }

    public void setAlgarismosDividendo(int algarismosDividendo) {
        this.algarismosDividendo = algarismosDividendo;
    }

    public int getAlgarismosDivisor() {
        return algarismosDivisor;
    }

    public void setAlgarismosDivisor(int algarismosDivisor) {
        this.algarismosDivisor = algarismosDivisor;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    @Override
    public String toString() {
        return "Continha{" +
                "dividendo=" + dividendo +
                ", divisor=" + divisor +
                ", resto=" + resto +
                ", algarismosDividendo=" + algarismosDividendo +
                ", algarismosDivisor=" + algarismosDivisor +
                '}';
    }
}
