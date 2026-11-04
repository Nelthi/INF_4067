package srp.good;

/** Présentation : ne gère QUE l'affichage d'un livre. */
public class BookPrinter {

    public void printToScreen(Book book) {
        System.out.println("===Print to Screen===");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    // On peut ajouter d'autres formats d'affichage sans toucher à Book
    public void printToHTML(Book book) {
        System.out.println("===Print to HTML===");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}
