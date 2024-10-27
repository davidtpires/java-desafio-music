package br.com.alura.java_desafio_music;

import br.com.alura.java_desafio_music.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDesafioMusicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaDesafioMusicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
