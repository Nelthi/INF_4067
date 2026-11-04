package srp.good;

/** Persistance : ne gère QUE la sauvegarde d'un livre. */
public class BookSaver {

    public void saveToDatabase(Book book) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' en base de données...");
    }

    // On peut ajouter d'autres façons de sauvegarder
    public void saveToFile(Book book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans " + filename);
    }
}
