import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        String password = "Caput Draconis";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String passwordAttemp = String.valueOf(scanner.nextLine());
        if(password.equals(passwordAttemp)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
