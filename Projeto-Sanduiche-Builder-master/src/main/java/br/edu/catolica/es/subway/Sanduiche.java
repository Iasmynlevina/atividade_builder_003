package br.edu.catolica.es.subway;
import lombok.Data;
import java.util.List;

@Data
public class Sanduiche {

    private String tipoDePao, recheio, extra;
    private List<String> opcoesDeMolhos;
    public void setMolho(List<String> opcoesDeMolhos){
        this.opcoesDeMolhos = opcoesDeMolhos;
    }
}
