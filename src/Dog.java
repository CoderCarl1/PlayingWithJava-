package src;

public class Dog implements Animal {

  @Override
  public void speak() {
    System.out.println("woofers");
    
  }

  @Override
  public void eat() {
    System.out.println("nom nom nom, yum! Dog Biscuits!!");
    
  }
  
}
