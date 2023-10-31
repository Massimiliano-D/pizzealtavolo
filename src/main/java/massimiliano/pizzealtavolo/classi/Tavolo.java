package massimiliano.pizzealtavolo.classi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
@ToString
public class Tavolo {
    StatoTavolo statoTavolo;
    @Value("${coperto.costo}")
    private int coperto;
    private int numero;
    private int numeroPersone;
}
