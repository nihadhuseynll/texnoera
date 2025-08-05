package abstraction;

public class OracleDB extends AbstractDB{
    @Override
    void update() {
        System.out.println("Oracle DB update");
    }

    @Override
    void getData() {

        System.out.println("Oracle DB getData");
    }
}
