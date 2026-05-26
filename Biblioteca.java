import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros; // Agregação

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("Biblioteca: " + nome);
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3");

        for (Livro l : livros) {
            System.out.println(l);
        }
    }
}