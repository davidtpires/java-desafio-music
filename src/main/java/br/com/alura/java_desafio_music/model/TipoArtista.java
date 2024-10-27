package br.com.alura.java_desafio_music.model;

public enum TipoArtista {
    SOLO("Solo"),
    DUPLA("Dupla"),
    BANDA("Banda");

    private String tipoArtistaPortugues;

    TipoArtista(String tipoArtistaPortugues) {
        this.tipoArtistaPortugues = tipoArtistaPortugues;
    }

    public static TipoArtista fromPortugues(String text) {
        for (TipoArtista tipoArtista : TipoArtista.values()) {
            if (tipoArtista.tipoArtistaPortugues.equalsIgnoreCase(text)){
                return tipoArtista;
            }
        }
        throw new IllegalArgumentException("Nenhum tipo de artista encontrada para a string fornecida: " + text);
    }
}
