package br.com.alura.java_desafio_music;

import br.com.alura.java_desafio_music.principal.Principal;
import br.com.alura.java_desafio_music.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDesafioMusicApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(JavaDesafioMusicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
