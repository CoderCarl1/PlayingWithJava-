package pluralsight.calcengine;

public class MathEquation {
  private double leftVal, rightVal, result;
  private char opCode;
  private static int numberOfCalculations;
  private static double sumOfResults;

  public MathEquation() {
  }

  public MathEquation(char opCode) {
    setOpCode(opCode);
  }

  public MathEquation(char opCode, double leftVal, double rightVal) {
    this(opCode);
    setLeftVal(leftVal);
    setRightVal(rightVal);
  }

  public void execute() {
    switch (opCode) {
    case 'a':
      result = leftVal + rightVal;
      break;
    case 's':
      result = leftVal - rightVal;
      break;
    case 'm':
      result = leftVal * rightVal;
      break;
    case 'd':
      result = rightVal != 0 ? leftVal / rightVal : 0.0d;
      break;
    default:
      System.out.println("Invalid opCode: " + opCode);
      result = 0.0d;
      break;
    }
    numberOfCalculations++;
    sumOfResults += result;
  }

  public void execute(double leftVal, double rightVal) {
    setLeftVal(leftVal);
    setRightVal(rightVal);
    execute();
  }

  public void execute(int leftVal, int rightVal) {
    setLeftVal(leftVal);
    setRightVal(rightVal);
    execute();
    result = (int) result;
  }

  public static double getAverageResult() {
    return sumOfResults / numberOfCalculations;
  }

  public double getResult() {
    return this.result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public double getLeftVal() {
    return this.leftVal;
  }

  public void setLeftVal(double leftValue) {
    this.leftVal = leftValue;
  }

  public void setRightVal(double rightValue) {
    this.rightVal = rightValue;
  }

  public double getRightVal() {
    return this.rightVal;
  }

  public char getOpCode() {
    return opCode;
  }

  public void setOpCode(char opCode) {
    this.opCode = opCode;
  }
}
