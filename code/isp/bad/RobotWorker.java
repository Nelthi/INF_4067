package isp.bad;

/** MAUVAIS DESIGN (viole ISP) : le robot est forcé d'implémenter eat() qui n'a pas de sens pour lui. */
public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
}
