import java.util.List;

public class Application {

    public static void main(String[] args) {

        MusicaCsvReader reader = new MusicaCsvReader();

        List<Musica> musicas =
                reader.lerArquivo("catalogo_musical.csv");

        musicas.forEach(System.out::println);
    }
}