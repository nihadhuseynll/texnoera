package factorys;

public class User {
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public void showPermissions() {
        Permission permission = PermissionFactory.getPermission(role);
        System.out.println("İstifadəçi: " + name + ", Rol: " + role);
        permission.printPermissions();
    }
}
