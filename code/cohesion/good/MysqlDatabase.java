package cohesion.good;

/** Implémentation concrète interchangeable. */
public class MysqlDatabase implements BaseDeDonnees {
    @Override
    public void executer(String requete) {
        System.out.println("Exécution MySQL : " + requete);
    }
}
