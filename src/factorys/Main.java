package factorys;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nihad", UserRole.ADMIN);
        User user2 = new User("Elvin", UserRole.MODERATOR);
        User user3 = new User("Aynur", UserRole.USER);

        user1.showPermissions();
        System.out.println("------");
        user2.showPermissions();
        System.out.println("------");
        user3.showPermissions();
    }
}
