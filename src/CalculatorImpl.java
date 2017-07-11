/**
 * Created by Mehrbod on 7/11/2017.
 */
public class CalculatorImpl implements Calculator {
    private int firstNumber;
    private int secondNumber;
    private int result;

    public CalculatorImpl(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    @Override
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public void setResult() {
        this.result = 0;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void addTwoNumber() {
        this.result = this.firstNumber + this.secondNumber;
    }

    @Override
    public void multiplyTwoNumber() {
        this.result += this.firstNumber * this.secondNumber;
    }

    @Override
    public void powerTwoNumber() {
        this.result += Math.pow(firstNumber, secondNumber);
    }
}
