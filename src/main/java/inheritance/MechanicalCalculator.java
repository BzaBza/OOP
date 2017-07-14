package inheritance;

/**
 * Created by ARTUR on 13.07.2017.
 */
public class MechanicalCalculator extends Calculator {
    protected void simpleCalculation(int i) {
        calculate(1 + i);
    }
}
