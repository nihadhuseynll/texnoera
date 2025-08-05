package abstraction;

public class MongoDB extends AbstractDB {
    @Override
    void update() {
        System.out.println("MongoDB data  update");
    }

    @Override
    void getData() {

        System.out.println("MongoDB data  getData");
    }
}
