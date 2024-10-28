package br.com.alura.java_desafio_music.repository;

import br.com.alura.java_desafio_music.model.Artista;
import br.com.alura.java_desafio_music.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNomeContainingIgnoreCase(String nomeArtista);

    @Query("Select m FROM Artista a JOIN a.musicas m")
    List<Musica> listaMusicas();

}
