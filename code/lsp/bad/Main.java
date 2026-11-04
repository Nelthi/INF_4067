package lsp.bad;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4); // on attend une aire de 20
        System.out.println("Aire du rectangle = " + rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(4); // on attend une aire de 20, mais on obtient 16 (4x4)
        System.out.println("Aire du carré (vu comme un Rectangle) = " + square.getArea() + "  <-- résultat inattendu");
    }
}
