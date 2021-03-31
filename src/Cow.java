package src;

public class Cow implements Animal{

  @Override
  public void speak() {
    System.out.println("mooo");
    
  }

  @Override
  public void eat() {
    System.out.println("munching on Grass");
    
  }
  
}
