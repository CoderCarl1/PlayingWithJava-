package src;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    /*
     * Calculator
     */
    // Scanner keyboardInput = new Scanner(System.in);
    // System.out.print("Enter a Number: ");
    // double num1 = keyboardInput.nextDouble();
    // System.out.print("Enter an Operator: ");
    // String op = keyboardInput.next();
    // System.out.print("Enter a 2nd Number: ");
    // double num2 = keyboardInput.nextDouble();
    // System.out.println(calculator(num1, num2, op));

    /*
     * gets a day name
     */
    // System.out.println(getDayName(2));

    /*
     * while loop
     */
    // whileLoop();

    /*
     * while loop Guessing Game
     */
    System.out.println(guessingGame());
  }

  public static String guessingGame() {
    Scanner keyboardInput = new Scanner(System.in);
    String secretWord = "secret";
    String guess = "";
    int guessCounter = 0;
    boolean outOfGuess = false;

    while (!guess.equals(secretWord) && !outOfGuess) {
      System.out.print("Enter a guess: ");
      guess = keyboardInput.nextLine();
      if (!guess.equals(secretWord) && guessCounter < 3) {
        System.out.println("Boo Boo! Try Again! " + (2 - guessCounter) + " tries left...");
        guessCounter++;
      }
      if (guessCounter == 3) {
        outOfGuess = true;
      }
    }

    if (outOfGuess) {
      System.out.println("You lose");
      System.out.println("Do you want to play again? : Y/N?");
      String response = keyboardInput.nextLine();
      if (response.toUpperCase().equals("Y")) {
        guessingGame();
      } else {
        return "Thanks for Playing. Game ending now.";
      }
    }

    return "You Win!";
  }

  // basic While Loop
  public static void whileLoop() {
    int i = 0;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }
  }

  public static String sayHi(String name) {
    return ("Hello " + name);
  }

  public static void ifStatement() {
    boolean isMale = true;
    boolean isTall = false;
    if (isMale && isTall) {
      System.out.println("You are a tall male");
    } else if (isMale && !isTall) {
      System.out.println("You are a short male");
    } else {
      System.out.println("You are either not male");
    }
  }

  public static double calculator(double num1, double num2, String op) {

    double result = 0.0;

    if (op.equals("+")) {
      result = num1 + num2;
    } else if (op.equals("-")) {
      result = num1 - num2;
    } else if (op.equals("/")) {
      result = num1 / num2;
    } else if (op.equals("*")) {
      result = num1 * num2;
    }
    return result;
  }

  public static String getDayName(int dayNum) {
    switch (dayNum) {
    case 0:
      return "Sunday";
    case 1:
      return "Monday";
    case 2:
      return "Tuesday";
    case 3:
      return "Wednesday";
    case 4:
      return "Thursday";
    case 5:
      return "Friday";
    case 6:
      return "Saturday";
    default:
      return "You need to enter a number between 0-6";
    }

  }

}