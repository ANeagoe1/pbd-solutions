import java.util.Scanner;

public class twomorequestions {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Two More Questions!!");
    System.out.println("Think of something and I'll try to guess it!");
    System.out.println("Question 1) Does it stay inside or outside or both?");
    String answerOne = sc.nextLine();
    System.out.println("Question 2) Is it a living thing?");
    String answerTwo = sc.nextLine();
    
    if (answerOne.equals ("outside") && answerTwo.equals ("yes")){
        System.out.println("You are thinking of a bison.");
    }
    if (answerOne.equals ("outside") && answerTwo.equals ("no")){
        System.out.println("You are thinking of a billboard.");
    }
    if (answerOne.equals ("inside") && answerTwo.equals ("yes")){
        System.out.println("You are thinking of a houseplant.");
    }
    if (answerOne.equals ("inside") && answerTwo.equals ("no")){
        System.out.println("You are thinking of a shower curtain.");
    }
    if (answerOne.equals ("both") && answerTwo.equals ("yes")){
        System.out.println("You are thinking of a dog.");
    }
    if (answerOne.equals ("both") && answerTwo.equals ("no")){
        System.out.println("You are thinking of a cell phone.");
    }
    }
    
}
  
