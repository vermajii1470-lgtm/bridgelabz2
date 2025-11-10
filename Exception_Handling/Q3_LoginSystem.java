import java.util.Scanner;
public class Q3_LoginSystem {
    static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String m){ super(m); }
    }

    static void validate(String user, String pass) throws InvalidCredentialsException {
        String correctUser = "admin";
        String correctPass = "password123";
        if(!correctUser.equals(user) || !correctPass.equals(pass)) throw new InvalidCredentialsException("Invalid username or password.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();
        try {
            validate(u, p);
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage() + " Please try again.");
        } finally {
            sc.close();
        }
    }
}
