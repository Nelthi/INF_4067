package isp.good;

/** Ne dépend que de ce dont il a besoin : Workable. */
public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }
}
