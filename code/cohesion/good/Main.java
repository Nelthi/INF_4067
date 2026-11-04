package cohesion.good;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande(List.of(1500.0, 2500.0, 1000.0));
        CommandeRepository repository = new CommandeRepository(new MysqlDatabase());
        repository.sauvegarder(commande);
    }
}
