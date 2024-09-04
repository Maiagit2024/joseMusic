package br.com.jose.minhasmusicas;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private String cantor;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private int classificacao;

    public void curtir(){
        this.totalCurtidas++;

    }

    public void reproduz(){
        this.totalReproducoes++;
    }

}
