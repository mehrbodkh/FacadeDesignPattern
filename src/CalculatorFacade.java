/**
 * Created by Mehrbod on 7/11/2017.
 */
public class CalculatorFacade {
    private final Calculator calculator;

    public CalculatorFacade(Calculator calculator) {
        this.calculator = calculator;
    }

    public void runCalculator() {
        calculator.addTwoNumber();
        calculator.multiplyTwoNumber();
        calculator.powerTwoNumber();
    }
}
