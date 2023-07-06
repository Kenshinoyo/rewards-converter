import com.sun.jdi.Value;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200; //<--Mock Value
        int convertedMilesValue = (int)(cashValue/0.0035); /*<-- Setting variable for conversion operation. Value is
                                                                  casted to an integer for accurate output. */
        var rewardValue = new RewardValue(cashValue); //<-- Creating a new Reward Value object to test mock value
        assertEquals(convertedMilesValue, rewardValue.getMilesValue()); /*<--Changed boolean test to "equals" test to
                                                                            check if the converted test value matches
                                                                            the RewardValue class output. */
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 20000; //<--Mock Value
        double convertedCashValue = milesValue*0.0035;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(convertedCashValue, rewardValue.getCashValue());
    }
}
