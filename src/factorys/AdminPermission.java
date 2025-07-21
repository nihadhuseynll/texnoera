package factorys;

public class AdminPermission implements Permission {
    @Override
    public void printPermissions() {
        System.out.println("Admin Permission");
    }
}
