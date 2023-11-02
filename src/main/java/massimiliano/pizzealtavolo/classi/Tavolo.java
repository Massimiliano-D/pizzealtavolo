package massimiliano.pizzealtavolo.classi;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data

@ToString
public class Tavolo {
    StatoTavolo statoTavolo;
    @Value("${coperto.costo}")
    private int coperto;
    private int numero;
    private int numeroPersone;


    public Tavolo(StatoTavolo statoTavolo, int numero, int numeroPersone) {
        this.statoTavolo = statoTavolo;
        this.numero = numero;
        this.numeroPersone = numeroPersone;
    }
}
