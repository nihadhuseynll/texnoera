package factorys;

public class PermissionFactory {

    public static Permission getPermission(UserRole role) {
        return switch (role) {
            case ADMIN -> new AdminPermission();
            case MODERATOR -> new ModeratorPermission();
            case USER -> new UserPermission();
        };
    }
}
