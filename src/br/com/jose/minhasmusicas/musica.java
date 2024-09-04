package br.com.jose.minhasmusicas;

public class musica extends Audio{

    private String artista;
    private String genero;

    private String album;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int getTotalReproducoes() {
        if(this.getTotalReproducoes()>2000) {
            return 10;

        }else{
            return 7;
        }
    }
}
