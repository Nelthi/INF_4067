package dip.good;

public class Main {
    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        new OrderProcessor(database).processOrder("Données à sauvegarder");

        database = new MongoDBDatabase();
        new OrderProcessor(database).processOrder("Données à sauvegarder");
    }
}
