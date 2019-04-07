package br.com.digitalhouse;

public class SessaoDeTreinamento {
    //Atttributes
    private Integer experiencia;

    //Constructor
    public SessaoDeTreinamento(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //Getters & Setters
    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //Class methods
    public void treinarA(JogadorDeFutebol jogador) {
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        Integer experienciaJogador = jogador.getExperiencia();
        System.out.println("Experiência inicial: " + experienciaJogador);
        experienciaJogador += this.experiencia;
        jogador.setExperiencia(experienciaJogador);
        System.out.println("Experiência final: " + experienciaJogador);
    }
}
