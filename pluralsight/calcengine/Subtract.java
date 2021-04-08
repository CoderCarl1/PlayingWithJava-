package pluralsight.calcengine;

public class Subtract extends CalculateBase implements MathProcessing {
  public Subtract() {
  }

  public Subtract(double leftVal, double rightVal) {
    super(leftVal, rightVal);
  }

  @Override
  public void calculate() {
    double value = getLeftVal() - getRightVal();
    setResult(value);
  }

  @Override
  public String getKeyWord() {
    return "subtract";
  }

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    setLeftVal(leftVal);
    setRightVal(rightVal);
    calculate();
    return getResult();
  }
}
