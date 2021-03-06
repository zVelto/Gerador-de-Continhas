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

    public int getLinhasNecessarias() {
        return linhasNecessarias;
    }

    public void setLinhasNecessarias(int linhasNecessarias) {
        this.linhasNecessarias = linhasNecessarias;
    }

    public int getQuociente() {
        return quociente;
    }

    public void setQuociente(int quociente) {
        this.quociente = quociente;
    }

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "{" +
                "dividendo = " + dividendo +
                ", divisor = " + divisor +
                ", linhas = " + linhasNecessarias +
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
