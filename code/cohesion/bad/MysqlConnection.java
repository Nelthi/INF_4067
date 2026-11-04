package cohesion.bad;

/** Simulation d'une connexion MySQL (détail technique de bas niveau). */
public class MysqlConnection {
    public MysqlConnection(String host, String user, String password) {
        System.out.println("Connexion à MySQL sur " + host + " (utilisateur " + user + ")");
    }

    public void executerRequete(String requete) {
        System.out.println("Exécution MySQL : " + requete);
    }
}
