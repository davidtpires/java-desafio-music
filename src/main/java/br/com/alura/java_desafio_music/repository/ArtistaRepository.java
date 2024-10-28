package br.com.alura.java_desafio_music.repository;

import br.com.alura.java_desafio_music.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
