/**
 * Created by Mehrbod on 7/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl(4, 4);

        CalculatorFacade facade = new CalculatorFacade(calculator);
        facade.runCalculator();
        System.out.println(calculator.getResult());
    }
}
