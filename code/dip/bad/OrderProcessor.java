package dip.bad;

/**
 * MAUVAIS DESIGN (viole DIP) : le module de haut niveau (métier) crée et dépend
 * directement d'une classe concrète de bas niveau (MySQLDatabase).
 * Impossible de changer de base ou de tester sans MySQL.
 */
public class OrderProcessor {
    private final MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
