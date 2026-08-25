import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusicaCsvReader {

    public List<Musica> lerArquivo(String caminhoArquivo) {

        List<Musica> musicas = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(caminhoArquivo))) {

            String linha;

            // pula o cabeçalho
            reader.readLine();

            while ((linha = reader.readLine()) != null) {

                String[] dados = linha.split(";");

                String titulo = dados[0];
                String artista = dados[1];
                String genero = dados[2];
                int duracaoSegundos = Integer.parseInt(dados[3]);
                long reproducoes = Long.parseLong(dados[4]);

                Musica musica = new Musica(
                        titulo,
                        artista,
                        genero,
                        duracaoSegundos,
                        reproducoes
                );

                musicas.add(musica);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        return musicas;
    }
}