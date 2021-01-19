public enum Dificuldade {

    MUITO_FACIL(new Intervalo(600, 9999), new Intervalo(2, 5), 0),
    FACIL(new Intervalo(4700, 99999), new Intervalo(5, 8), 1),
    INTERMEDIARIO(new Intervalo(10000, 999999), new Intervalo(7, 9), 2),
    DIFICL(new Intervalo(100000, 99999999), new Intervalo(7, 20), 3),
    MUITO_DIFICIL(new Intervalo(1000000, 999999999), new Intervalo(10, 35), 4);

    private Intervalo intDividendo;
    private Intervalo intDivisor;
    private int cod;

    Dificuldade(Intervalo intDividendo, Intervalo intDivisor, int cod) {
        this.intDividendo = intDividendo;
        this.intDivisor = intDivisor;
        this.cod = cod;
    }

    public static Dificuldade toEnum(int cod) {
        for (Dificuldade dif : Dificuldade.values()) {
            if(cod == dif.getCod()) {
                return dif;
            }
        }

        throw new IllegalArgumentException("Dificuldade não encontrada");
    }

    public Intervalo getIntDividendo() {
        return intDividendo;
    }

    public Intervalo getIntDivisor() {
        return intDivisor;
    }

    public int getCod() {
        return cod;
    }
}
