package entities;

public class Continha {

    private int dividendo;
    private int divisor;
    private int linhasNecessarias;
    private int quociente;
    private int resto;

    public Continha() {
    }

    public Continha(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
        this.quociente = dividendo / divisor;
        this.resto = dividendo % divisor;
        this.linhasNecessarias = (String.valueOf(quociente).length() * 2) + 2;

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
        return "{" +
                "dividendo = " + dividendo +
                ", divisor = " + divisor +
                ", linhas necessárias = " + linhasNecessarias +
                '}';
    }

    public String resposta() {
        return new StringBuilder()
                .append("Quociente = ")
                .append(quociente)
                .append(", resto = ")
                .append(resto)
                .toString();
    }
}
