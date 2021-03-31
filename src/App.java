package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    /*
     * Calculator
     */
    //// Scanner keyboardInput = new Scanner(System.in);
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
    // System.out.println(guessingGame());

    /*
     * forLoop
     */
    // forLoop();

    /*
     * Array forLoop
     */
    // arrayForLoop();
    /*
     * to the power forLoop
     */
    // System.out.println(powForLoop(3, 4));
    /*
     * nested loops
     */
    // nestedNumberGrid();
    /*
     * Try / Catch
     */
    // tryCatch();
    /*
     * Playing with classes
     */
    // with constructor
    // Book book1 = new Book("title1", "author1", 501, "eng");
    // Book book2 = new Book("title2", "author2", 502, "eng");

    /*
     * Multiple Choice questionare
     */
    // System.out.println(multipleChoice());

    /*
     * Class Methods
     */
    // Student myStudent = new Student("mike", "2nd Name", 3.6, "Computer Science",
    // 26, false);
    // System.out.println(myStudent.isOnHonorRoll());

    /*
     * Class Getters and Setters & Private
     */
    // Movie movie1 = new Movie("The avengers", "Joss Whedon", "PG-13");
    // Movie movie2 = new Movie("Step Brothers", "Adam McKat", "R");
    // System.out.println(movie1.getTitle());
    // System.out.println(movie2.getRating());
    /*
     * Class static variables
     */
    // Song holiday = new Song("Holiday", "Green Day", 200);
    // System.out.println(holiday.getSongsCount());
    // Song americanIdiot = new Song("American Idiot", "Green Day", 168);
    // System.out.println(americanIdiot.getSongsCount());
    // Song africa = new Song("Africa", "Toto", 300);
    // System.out.println(africa.getSongsCount());
    /*
     * Class static methods
     */
    // Prints.sayGoodbye();
    // System.out.println(Prints.feetInMile);
    /*
     * Class extends
     */
    // Chef normalChef = new Chef();
    // normalChef.makeSpecialDish();
    // ItalianChef italianChef = new ItalianChef();
    // italianChef.makeSpecialDish();
    /*
     * Class implementation of interfaces
     */

    // Animal[] animals = { new Cow(), new Bird(), new Dog() };

    // Animal myCow = new Cow();
    // myCow.eat();

    // Animal myDog = new Dog();
    // myDog.eat();

    // for(int i = 0; i < animals.length; i++){
    // if (i % 2 == 0) animals[i].eat();
    // if (i % 2 != 0) animals[i].speak();
    // }
    /*
     * class Non-static methods
     */
    App myApp = new App();
      myApp.nonStaticMethod();
  }

  public void nonStaticMethod(){
    System.out.println("Hi");
  }

  public static String multipleChoice() {
    String q1 = "What color are Apples?\n" + "(a) Red/Green\n(b) Yellow\n(c) Magenta\n";
    String q2 = "What color are Bananas?\n" + "(a) Red/Green\n(b) Yellow\n(c) Magenta\n";

    Question[] questions = { new Question(q1, "a"), new Question(q2, "b") };
    return takeTest(questions);
  }

  public static String takeTest(Question[] questions) {
    int score = 0;
    Scanner keyboardInput = new Scanner(System.in);

    for (int i = 0; i < questions.length; i++) {
      // try{

      // } catch (Exception e){

      // }
      System.out.println(questions[i].prompt);
      String answer = keyboardInput.nextLine();
      if (answer.equals(questions[i].answer)) {
        System.out.println("Correct!\n" + "You have " + (questions.length - (i + 1)) + " Question\\s left.");
        score++;
      } else {
        System.out
            .println("boo boo! wrong answer!\n" + "You have " + (questions.length - (i + 1)) + " Question\\s left.");
      }
    }
    if (score == questions.length)
      return "You got all the questions correct! you rock!";
    return "You got | " + score + " / " + questions.length + " |";
  }

  public static void tryCatch() {
    Scanner keyboardInput = new Scanner(System.in);
    try {
      System.out.print("Enter a Number: ");
      double num = keyboardInput.nextDouble();
      System.out.print(num);

    } catch (Exception e) {
      if (e instanceof InputMismatchException) {
        System.out.println("Enter a number, letters or other characters are not valid input.");
        tryCatch();
      } else {

        System.out.println(e);
      }
      // System.out.println("invalid input, please enter a number.");
      // tryCatch();
    }
  }

  public static void nestedNumberGrid() {
    int[][] numberGrid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0 } };

    for (int i = 0; i < numberGrid.length; i++) {
      for (int j = 0; j < numberGrid[i].length; j++) {
        System.out.println(numberGrid[i][j]);
      }
      System.out.println("end of 1 loop");
    }

  }

  public static int powForLoop(int baseNum, int powNum) {
    int result = 1;
    for (int i = 0; i < powNum; i++) {
      result = result * baseNum;
    }
    return result;
  }

  public static void forLoop() {
    for (int i = 0; i <= 10; i++) {
      if (i == 10) {
        System.out.println(i);
      } else {
        System.out.print(i + ", ");
      }
    }
    ;
  }

  public static void arrayForLoop() {
    String[] friends = { "bob", "Garry", "Jane" };
    for (int i = 0; i < friends.length; i++) {
      System.out.println(friends[i]);
    }
    ;
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