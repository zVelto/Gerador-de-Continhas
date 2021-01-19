public class Intervalo {

    private int numMin;
    private int numMax;

    public Intervalo(int numMin, int numMax) {
        this.numMin = numMin;
        this.numMax = numMax;
    }

    public int bound() {
        return (numMax + 1) - numMin;
    }

    public int getNumMin() {
        return numMin;
    }

    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }
}
