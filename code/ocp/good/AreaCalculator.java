package ocp.good;

/** Fermée à la modification : fonctionne pour toute future implémentation de Shape. */
public class AreaCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
