package dip.good;

/** Dépend de l'abstraction Database, reçue par injection de dépendance via le constructeur. */
public class OrderProcessor {
    private final Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
