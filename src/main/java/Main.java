public class Main {
    public static void main(String[] args) {
        ContinhaService service = new ContinhaService(0, 5, 6, 2);
        service.GerarLista();
        service.imprimirLista();
    }
}
