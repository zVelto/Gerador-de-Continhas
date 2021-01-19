import java.util.Random;

public class Continha {

    private int dividendo;
    private int divisor;

    public Continha() {
    }

    public Continha(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    @Override
    public String toString() {
        return "Continha {" +
                "dividendo = " + dividendo +
                ", divisor = " + divisor +
                '}';
    }
}
