package br.edu.catolica.es.subway;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var opcoesDeMolhos = Arrays.asList("Agridoce", "Maionese", "Mostarda");
        var sanduiche1 = new SanduicheBuilder("Parmesao")
                .recheio("Camarao")
                .molho(opcoesDeMolhos) //
                .extra("Farofa de Bacon")
                .create();

        System.out.println("Sanduiche 1: "+sanduiche1);
    }
}