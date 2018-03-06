import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean runProgram = true;
       while(runProgram) {
           System.out.println("Please enter your current Earth weight:");
           int weight = sc.nextInt();

           double relativeVenus = 0.78;
           double relativeMars = 0.39;
           double relativeJupiter = 2.65;
           double relativeSaturn = 1.17;
           double relativeUranus = 1.05;
           double relativeNeptune = 1.23;
           double relativeWeight = 0;

           System.out.println("I have the information for the following planets:");
           System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter");
           System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune");
           System.out.println("\t7. Exit");

           System.out.println("\nWhich planet are you visiting?");

           int planet = sc.nextInt();

           if (planet == 1) {
               relativeWeight = weight * relativeVenus;
           } else if (planet == 2) {
               relativeWeight = weight * relativeMars;
           } else if (planet == 3) {
               relativeWeight = weight * relativeJupiter;
           } else if (planet == 4) {
               relativeWeight = weight * relativeSaturn;
           } else if (planet == 5) {
               relativeWeight = weight * relativeUranus;
           } else if (planet == 6) {
               relativeWeight = weight * relativeNeptune;
           }
           else if (planet == 7){
               runProgram = false;
           }
           else {
               System.out.println("invalid selection, select a number from 1-6");
           }
           if (relativeWeight != 0) {
               System.out.println("Your weight would be " + relativeWeight + " pounds on that planet.");
           }
       }







           }
}
