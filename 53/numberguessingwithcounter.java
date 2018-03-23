import java.util.*;

public class main {
    public static void main(String[] args) {
        Random r = new Random();

        int number = 1 + r.nextInt(10);

        int tries = 1;
         System.out.println("I have chosen a number between 1 and 10. Try to guess it");

         Scanner keyboard = new Scanner(System.in);
        System.out.println("Your guess :");
        int guess = keyboard.nextInt();
        while (guess != number) {
            System.out.print("Incorrect,Guess again.\nYour guess:\r");
            guess = keyboard.nextInt();
            tries++;
        }

        System.out.println("Thats right, you're a good guesser.");
        System.out.println("It only took you " + tries + " tries.");

    }
}



