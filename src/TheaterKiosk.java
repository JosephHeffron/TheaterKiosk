import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Checking if the age is 21 or older
        if (age >= 21) {
            // Displaying a message that they get a wristband
            System.out.println("You get a wristband.");
        }

        scanner.close();
    }
}
