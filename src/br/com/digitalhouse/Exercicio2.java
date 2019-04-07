package br.com.digitalhouse;

public class Exercicio2 {
    public static void main(String[] args) {

        //Instanciando
        JogadorDeFutebol mateus = new JogadorDeFutebol("Mateus", 300, 100, 0, 0);
        JogadorDeFutebol carolina = new JogadorDeFutebol("Carolina", 100, 300, 0, 0);

        SessaoDeTreinamento treinamento = new SessaoDeTreinamento(1000);

        treinamento.treinarA(mateus);
        treinamento.treinarA(carolina);
    }
}
