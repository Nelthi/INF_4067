package cohesion.bad;

import java.util.List;

/**
 * MAUVAIS DESIGN : faible cohésion et fort couplage.
 * - Faible cohésion : métier (calcul du total) mélangé à la technique (SQL).
 * - Fort couplage : la classe crée elle-même une MysqlConnection ; impossible
 *   de changer de SGBD ou de tester la commande sans base de données.
 */
public class Commande {
    private final List<Double> prixItems;
    private double total;

    public Commande(List<Double> prixItems) {
        this.prixItems = prixItems;
    }

    // BON : logique métier propre à la commande
    public void calculerTotal() {
        this.total = prixItems.stream().mapToDouble(Double::doubleValue).sum();
    }

    // MAUVAIS : mélange métier et technique, figé sur MySQL
    public void sauvegarderDansBaseMysql() {
        MysqlConnection connexion = new MysqlConnection("localhost", "root", "password");
        String requete = "INSERT INTO commandes (total) VALUES (" + this.total + ")";
        connexion.executerRequete(requete);
    }
}
