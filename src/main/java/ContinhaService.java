import java.util.ArrayList;
import java.util.List;

public class ContinhaService {

    private int resto;
    private int numContinhas;
    private int algarismosDividendo;
    private int algarismosDivisor;
    private List<Continha> list = new ArrayList<>();

    public ContinhaService() {
    }

    public ContinhaService(int resto, int numContinhas, int algarismosDividendo, int algarismosDivisor) {
        this.resto = resto;
        this.numContinhas = numContinhas;
        this.algarismosDividendo = algarismosDividendo;
        this.algarismosDivisor = algarismosDivisor;
    }

    public void GerarLista() {
        for(int i = 0; i < numContinhas; i++) {
            list.add(new Continha(algarismosDividendo, algarismosDivisor, resto));
        }
    }

    public void imprimirLista() {
        for (Continha c: list) {
            System.out.println(c);
        }
    }

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    public int getNumContinhas() {
        return numContinhas;
    }

    public void setNumContinhas(int numContinhas) {
        this.numContinhas = numContinhas;
    }

    public List<Continha> getList() {
        return list;
    }

}
