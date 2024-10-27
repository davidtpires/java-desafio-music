package br.com.alura.java_desafio_music.principal;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);


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
        System.out.println("Em desenvolvimento...");
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
