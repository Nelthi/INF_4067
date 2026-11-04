package isp.bad;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        try {
            robot.eat(); // compile, mais plante à l'exécution
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur à l'exécution : " + e.getMessage());
        }
    }
}
