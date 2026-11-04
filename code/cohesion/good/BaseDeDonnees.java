package cohesion.good;

/** Abstraction qui garantit le faible couplage. */
public interface BaseDeDonnees {
    void executer(String requete);
}
