package cohesion.good;

/** Forte cohésion : cette classe ne gère QUE la persistance. */
public class CommandeRepository {
    private final BaseDeDonnees db;

    // Injection de dépendance : on reçoit l'interface, pas une classe concrète
    public CommandeRepository(BaseDeDonnees db) {
        this.db = db; // Faible couplage : accepte MySQL, PostgreSQL, Oracle, etc.
    }

    public void sauvegarder(Commande commande) {
        String requete = "INSERT INTO commandes (total) VALUES (" + commande.calculerTotal() + ")";
        db.executer(requete);
    }
}
