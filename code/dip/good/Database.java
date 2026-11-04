package dip.good;

/** Abstraction dont dépendent à la fois le haut niveau et le bas niveau. */
public interface Database {
    void save(String data);
}
