package Exercicios_Avaliativos_4.ex1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;

    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirLivros() {
        System.out.println("Biblioteca: " + nome);
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo() + " | Autor: " + livro.getAutor().getNome());
        }
    }
}
