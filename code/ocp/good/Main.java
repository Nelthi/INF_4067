package ocp.good;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Aire du rectangle = " + calculator.calculateArea(new Rectangle(4, 3)));
        System.out.println("Aire du cercle    = " + calculator.calculateArea(new Circle(2)));
        System.out.println("Aire du triangle  = " + calculator.calculateArea(new Triangle(4, 3)));
    }
}
