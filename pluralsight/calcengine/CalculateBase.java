package pluralsight.calcengine;

public abstract class CalculateBase {
  private double leftVal, rightVal, result;

  public CalculateBase() {
  }

  public CalculateBase(double leftVal, double rightVal) {
    setLeftVal(leftVal);
    setRightVal(rightVal);
  }

  public double getResult() {
    return this.result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public void setLeftVal(double leftValue) {
    this.leftVal = leftValue;
  }

  public double getLeftVal() {
    return this.leftVal;
  }

  public void setRightVal(double rightValue) {
    this.rightVal = rightValue;
  }

  public double getRightVal() {
    return this.rightVal;
  }

  public abstract void calculate();
}
