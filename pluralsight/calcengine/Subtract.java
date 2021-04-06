package pluralsight.calcengine;

public class Subtract extends CalculateBase {

  @Override
  public void calculate() {
    double value = getLeftVal() - getRightVal();
    setResult(value);
  }
}
