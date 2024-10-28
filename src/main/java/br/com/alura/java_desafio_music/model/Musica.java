package br.com.alura.java_desafio_music.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int duracao;
    private LocalDate dataLancamento;
    private String album;
    @ManyToOne
    private Artista artista;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Musica() {}

    public Musica(String titulo, int duracao, String dataLancamento, String album, Artista artista) {
        this.titulo = titulo;
        this.duracao = duracao;
        try {
            LocalDate data = LocalDate.parse(dataLancamento, FORMATTER);
            this.dataLancamento = data;
        } catch (DateTimeParseException ex) {
            this.dataLancamento = null;
        }
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
                ", duracao=" + duracao +
                ", dataLancamento=" + dataLancamento +
                ", album='" + album + '\'' ;
    }
}
