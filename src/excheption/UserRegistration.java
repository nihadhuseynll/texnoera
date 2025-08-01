package excheption;

public class UserRegistration {

    public static void registerUser(String name, int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("User must be 18 or older to register.");
        }
        System.out.println("User " + name + " registered successfully.");
    }

    public static void main(String[] args) {
        try {
            registerUser("Ali", 16);
        } catch (UnderAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}
