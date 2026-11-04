package srp.good;

/** Logique métier : ne gère QUE les règles liées aux livres. */
public class BookBusinessLogic {

    public void emprunter(Book book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }

    // On peut ajouter d'autres règles métier
    public void autreService(Book book) {
        System.out.println("Autre logique métier sur le livre '" + book.getTitle() + "'");
    }
}
