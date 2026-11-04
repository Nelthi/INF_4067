package lsp.good;

/** Le carré n'hérite plus de Rectangle : les deux implémentent Shape et sont substituables via Shape. */
public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
