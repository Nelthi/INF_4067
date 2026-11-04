package cohesion.good;

import java.util.List;

/** Forte cohésion : cette classe ne gère QUE les données et le métier de la commande. */
public class Commande {
    private final List<Double> prixItems;

    public Commande(List<Double> prixItems) {
        this.prixItems = prixItems;
    }

    public double calculerTotal() {
        return prixItems.stream().mapToDouble(Double::doubleValue).sum();
    }
}
