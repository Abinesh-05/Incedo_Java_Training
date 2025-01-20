import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationForm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usernameRegEx = "^[a-zA-Z0-9]+$";
        String emailRegEx = "^[a-zA-Z0-9.%+-]+@gmail\\.com$";
        String dobRegEx = "^\\d{2}-\\d{2}-\\d{4}$";

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        while (!Pattern.matches(usernameRegEx, username)) {
            System.out.println("ERROR!! Enter a valid username (alphanumeric only):");
            username = sc.nextLine();
        }

        System.out.print("Enter email: ");
        String email = sc.nextLine();
        while (!Pattern.matches(emailRegEx, email)) {
            System.out.println("ERROR!! Enter a valid email (must end with @gmail.com):");
            email = sc.nextLine();
        }

        System.out.print("Enter DOB (dd-mm-yyyy): ");
        String dob = sc.nextLine();
        while (!Pattern.matches(dobRegEx, dob)) {
            System.out.println("ERROR!! Enter a valid DOB in dd-mm-yyyy format:");
            dob = sc.nextLine();
        }

        System.out.println("\nAll inputs are valid:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("DOB: " + dob);

        sc.close();
    }
}
