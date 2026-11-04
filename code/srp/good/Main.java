package srp.good;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");

        new BookPrinter().printToScreen(book);
        new BookPrinter().printToHTML(book);
        new BookSaver().saveToDatabase(book);
        new BookBusinessLogic().emprunter(book, "Marcial");
    }
}
