package br.com.alura.java_desafio_music.principal;

import br.com.alura.java_desafio_music.model.Artista;
import br.com.alura.java_desafio_music.repository.ArtistaRepository;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    private ArtistaRepository repositorio;

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }


    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    *** Screen Sound Músicas ***
                    
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    5 - Pesquisar dados sobre um artista
                    
                    0 - Sair
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtistas();
                    break;
                case 5:
                    pesquisarDadosArtista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        }
    }

    private void cadastrarArtistas(){
        System.out.println("*** Cadastro de Artista ***");
        System.out.println("Informe o nome do artista: ");
        var nome = leitura.nextLine();
        System.out.println("Informe o tipo de artista (banda/dupla/solo: ");
        var tipoArtista = leitura.nextLine();
        System.out.println("Informe o gênero musical:");
        var generoMusical = leitura.nextLine();
        System.out.println("Informe a nacionalidade");
        var nacionalidade = leitura.nextLine();

        Artista artista = new Artista(nome, tipoArtista, generoMusical, nacionalidade);
        repositorio.save(artista);
        System.out.println("Artista salvo com sucesso!");
        System.out.println(artista);
    }

    private void cadastrarMusicas(){
        System.out.println("Em desenvolvimento...");
    }

    private void listarMusicas(){
        System.out.println("Em desenvolvimento...");
    }

    private void buscarMusicasPorArtistas(){
        System.out.println("Em desenvolvimento...");
    }

    private void pesquisarDadosArtista(){
        System.out.println("Em desenvolvimento...");
    }

}
