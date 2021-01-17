import java.util.ArrayList;
import java.util.List;

public class ContinhaService {

    private List<Continha> list = new ArrayList<>();

    public ContinhaService() {
    }

    public void GerarLista(int dificuldade, int numContinhas) {

        for(int i = 0; i < numContinhas; i++) {

            int dividendo = GeradorEValidador.gerarDividendo(dificuldade);
            int divisor = GeradorEValidador.gerarDivisor(dificuldade);

            list.add(new Continha(dividendo, divisor));
        }
    }

    public void imprimirLista() {
        for (Continha c: list) {
            System.out.println(c);
        }
    }

    public List<Continha> getList() {
        return list;
    }

}
