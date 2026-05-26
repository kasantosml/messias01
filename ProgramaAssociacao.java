public class ProgramaAssociacao {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Manoel Messias", "Brasileiro");

        Livro livro1 = new Livro("Java", autor1);

        Capitulo cap1 = new Capitulo(1, "Cap 1");
        Capitulo cap2 = new Capitulo(2, "Cap 2");

        livro1.adicionarCapitulo(cap1);
        livro1.adicionarCapitulo(cap2);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Literature");

        biblioteca.adicionarLivro(livro1);

        biblioteca.listarLivros();
    }
}
