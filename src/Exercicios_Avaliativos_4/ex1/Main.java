package Exercicios_Avaliativos_4.ex1;



public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");

        Autor autor2 = new Autor("J.K Rowling", "Britânica");

        Livro livro1 = new Livro("Dom Casmurro", autor1);

        Livro livro2 = new Livro("Memórias Póstumas", autor1);

        Livro livro3 = new Livro("Harry Potter", autor2);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.exibirLivros();

    }
}