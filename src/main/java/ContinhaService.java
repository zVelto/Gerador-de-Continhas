import java.util.ArrayList;
import java.util.List;

public class ContinhaService {

    private List<Continha> list = new ArrayList<>();

    public ContinhaService() {
    }

    public void GerarLista(Dificuldade dificuldade, int numContinhas) {

        for(int i = 0; i < numContinhas; i++) {

            int dividendo = Gerador.gerarDividendo(dificuldade.getIntDividendo());
            int divisor = Gerador.gerarDivisor(dificuldade.getIntDivisor());

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
