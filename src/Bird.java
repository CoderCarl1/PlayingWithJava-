package src;

public class Bird implements Animal {

  @Override
  public void speak() {
    System.out.println("tweet tweet");
    
  }

  @Override
  public void eat() {
    System.out.println("Eat a worm");
    
  }
  
}
