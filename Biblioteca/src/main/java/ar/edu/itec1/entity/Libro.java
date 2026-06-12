package ar.edu.itec1.entity;

public class Libro{
    private String Isbn;
    private String Titulo;
    private String Autor;

    public Libro(String autor, String titulo, String isbn) {
        Autor = autor;
        Titulo = titulo;
        Isbn = isbn;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}
