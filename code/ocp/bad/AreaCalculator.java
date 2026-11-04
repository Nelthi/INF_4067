package ocp.bad;

/**
 * MAUVAIS DESIGN (viole OCP) : pour ajouter une forme (Triangle, ...), il faut
 * MODIFIER cette classe en ajoutant un nouveau « else if ». Le code déjà testé
 * et livré est donc rouvert à chaque évolution (rigidité et fragilité).
 */
public class AreaCalculator {

    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}
