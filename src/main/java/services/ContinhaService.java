package services;

import entities.Continha;
import entities.Intervalo;
import enums.Dificuldade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContinhaService {

    public static Random gerador = new Random();

    private List<Continha> list = new ArrayList<>();

    public ContinhaService() {
    }

    public void GerarLista(Dificuldade dificuldade, int numContinhas) {

        for(int i = 0; i < numContinhas; i++) {

            int dividendo = gerarDividendo(dificuldade.getIntDividendo());
            int divisor = gerarDivisor(dificuldade.getIntDivisor());

            list.add(new Continha(dividendo, divisor));
        }
    }

    public static int gerarDividendo(Intervalo inter) {

        return inter.getNumMin() + gerador.nextInt(inter.bound());

    }

    public static int gerarDivisor(Intervalo inter) {

        return inter.getNumMin() + gerador.nextInt(inter.bound());

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
