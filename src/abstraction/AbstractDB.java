package abstraction;

public abstract class AbstractDB {

    public void add() {
        System.out.println("Adding a new record");
    }

    public void delete() {
        System.out.println("Deleting a record");
    }

    abstract void update();

    abstract void getData();
}
