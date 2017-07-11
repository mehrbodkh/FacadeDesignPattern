/**
 * Created by Mehrbod on 7/11/2017.
 */
public interface Calculator {
    void setFirstNumber(int firstNumber);
    void setSecondNumber(int secondNumber);
    void setResult();

    int getFirstNumber();
    int getSecondNumber();
    int getResult();

    void addTwoNumber();
    void multiplyTwoNumber();
    void powerTwoNumber();
}
