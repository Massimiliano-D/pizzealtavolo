package massimiliano.pizzealtavolo.classi;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.List;

@Data

public class Ordine {
    int numeroOrdine;
    StatoOrdine statoOrdine;
    private List<Pizza> pizza;
    private List<Drink> drink;
    private int numeroPersone;
    @Value("${coperto.costo}")
    private int coperto;
    private LocalDateTime acquisizione;

    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, List<Pizza> pizza, List<Drink> drink, int numeroPersone, LocalDateTime acquisizione) {
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.pizza = pizza;
        this.drink = drink;
        this.numeroPersone = numeroPersone;
        this.acquisizione = acquisizione;
    }

    public double getConto() {
        double totPizze = pizza.stream().mapToDouble(Pizza::getPrezzo).sum();
        double totDrink = drink.stream().mapToDouble(Drink::getPrezzo).sum();
        int totCoperti = coperto * numeroPersone;
        return totPizze + totDrink + totCoperti;
    }


}
