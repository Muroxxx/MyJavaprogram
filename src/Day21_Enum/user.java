package Day21_Enum;

public class user {

    String username;

    Enum.role Role;

    Enum.statue Statue;

    public user(String username, Enum.role role, Enum.statue statue) {
        this.username = username;
        this.Role = role;
        this.Statue = statue;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", Role=" + Role +
                ", Statue=" + Statue +
                '}';
    }
}
