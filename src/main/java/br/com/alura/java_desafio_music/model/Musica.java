package br.com.alura.java_desafio_music.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String genero;
    private int duracao;
    private LocalDate dataLancamento;
    private String album;
    @ManyToOne
    private Artista artista;

    public Musica() {}

    public Musica(String titulo, String genero, int duracao, LocalDate dataLancamento, String album, Artista artista) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.dataLancamento = dataLancamento;
        this.album = album;
        this.artista = artista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                ", dataLancamento=" + dataLancamento +
                ", album='" + album + '\'' +
                ", artista=" + artista ;
    }
}
