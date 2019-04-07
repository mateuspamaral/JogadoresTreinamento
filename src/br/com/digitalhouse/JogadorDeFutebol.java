package br.com.digitalhouse;

public class JogadorDeFutebol {
    //Attributes
    private String nome;
    private Integer energia;
    private Integer alegria;
    private Integer gols;
    private Integer experiencia;

    //Constructors
    public JogadorDeFutebol(String nome, Integer energia, Integer alegria, Integer gols, Integer experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getAlegria() {
        return alegria;
    }

    public void setAlegria(Integer alegria) {
        this.alegria = alegria;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //Class methods
    public void fazerGol() {
        this.energia -= 5;
        this.alegria += 10;
        this.gols++;
        System.out.println("GOOOOL!");
    }

    public void correr() {
        this.energia -= 10;
        System.out.println("Cansei");
    }

}
