package ocp.bad;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Aire du rectangle = " + calculator.calculateArea(new Rectangle(4, 3)));
        System.out.println("Aire du cercle    = " + calculator.calculateArea(new Circle(2)));
        try {
            calculator.calculateArea("un triangle ?");
        } catch (IllegalArgumentException e) {
            System.out.println("Nouvelle forme non supportée sans modifier la classe : " + e.getMessage());
        }
    }
}
