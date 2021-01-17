import java.util.Random;

public class Continha {

    private int dividendo;
    private int divisor;
    private int resto;
    private int algarismosDividendo;
    private int algarismosDivisor;

    public Continha() {
    }

    public Continha(int algarismosDividendo, int algarismosDivisor, int resto) {
        this.algarismosDividendo = algarismosDividendo;
        this.algarismosDivisor = algarismosDivisor;
        this.resto = resto;
        generateCalculo();
    }

    public void generateDividendo() {
        Random gerador = new Random();
        dividendo = (int) (Math.pow(10, algarismosDividendo - 1) + gerador.nextInt((int) ((int) Math.pow(10, algarismosDividendo) - (Math.pow(10, algarismosDividendo - 1)))));
    }

    public void generateDivisor() {
        Random gerador = new Random();

        do {
            divisor = (int) Math.pow(10, algarismosDivisor - 1) + gerador.nextInt((int) ((int) Math.pow(10, algarismosDivisor) - Math.pow(10, algarismosDivisor - 1)));
        }while (divisor == 0);
    }

    public void generateCalculo() {
        int result = 0;
        do {
            generateDividendo();
            generateDivisor();
        } while(dividendo%divisor != resto);
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
                "dividendo = " + dividendo +
                ", divisor=" + divisor +
                '}';
    }
}
