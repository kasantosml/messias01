import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor; // Associação simples
    private ArrayList<Capitulo> capitulos; // Composição

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    @Override
    public String toString() {
        String texto = "Livro: " + titulo + "\n";
        texto += autor + "\n";
        texto += "Capítulos:\n";

        for (Capitulo c : capitulos) {
            texto += "- " + c + "\n";
        }

        return texto;
    }
}