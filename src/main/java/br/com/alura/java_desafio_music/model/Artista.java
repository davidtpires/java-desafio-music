package br.com.alura.java_desafio_music.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    private TipoArtista tipoArtista;
    private String generoMusical;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private String biografia;

    private List<Musica> musicas = new ArrayList<>();

    public Artista() {}

    public Artista(String nome, TipoArtista tipoArtista, String generoMusical, LocalDate dataNascimento, String nacionalidade, String biografia, List<Musica> musicas) {
        this.nome = nome;
        this.tipoArtista = tipoArtista;
        this.generoMusical = generoMusical;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.biografia = biografia;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TipoArtista tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", tipoArtista=" + tipoArtista +
                ", generoMusical='" + generoMusical + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", biografia='" + biografia + '\'' +
                ", musicas=" + musicas + '\'';
    }
}


