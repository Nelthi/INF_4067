package ocp.good;

/**
 * Nouvelle forme ajoutée APRÈS coup : on étend le système (nouvelle classe)
 * sans modifier ni Shape ni AreaCalculator. C'est l'essence de l'OCP.
 */
public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
