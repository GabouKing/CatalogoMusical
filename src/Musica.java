public class Musica {

    private String titulo;
    private String artista;
    private String genero;
    private int duracaoSegundos;
    private long reproducoes;

    public Musica(
            String titulo,
            String artista,
            String genero,
            int duracaoSegundos,
            long reproducoes) {

        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracaoSegundos = duracaoSegundos;
        this.reproducoes = reproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public long getReproducoes() {
        return reproducoes;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}