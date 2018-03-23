import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin = 13337;

    System.out.println("Welcome to the bank of Alex.");
    System.out.println("Enter your pin:");
    int entry = keyboard.nextInt();

    while (entry != pin) {
        System.out.println("\nIncorrect pin, try again.");
        System.out.println("Enter your pin.");
        entry = keyboard.nextInt();
        }

        System.out.println("\nPin accepted. you now have acess to your account");
    }
}
