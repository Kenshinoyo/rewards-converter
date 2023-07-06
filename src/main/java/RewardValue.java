/* *Dev Diary*:

    - When approaching this task, I was weighing the choice of whether to use a class constructor, or a parameterized
    constructor. I preferred the latter, because of how modular those style of constructors can be, but opted against it
    in hindsight, because of how few values there were.

    - Seeing the finished class, I now understand the significance of
    utilizing the more modular option, even if it doesn't seem necessary in the beginning.

    **Takeaways**
    /Gains:
   - Original constructor was close to requested form. Proper binding statement was missing.
   - Types were correct
   - Math was correct

    /Improvements:
    - Don't complicate the code by thinking too far ahead.
    - Use private types to make instantiation easier. Assumed class inheritance needed
    to be defined, when it was already set in converter.
    - Optimize variables
    */



public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue)
        {
            this.cashValue = cashValue;
        }

    public RewardValue(int milesValue)
        {
            this.cashValue = convertToCash(milesValue);
        }

    private static int convertToMiles(double cashValue)
        {
            return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        }

    private static double convertToCash(int milesValue)
        {
            return milesValue * MILES_TO_CASH_CONVERSION_RATE;
        }

    public double getCashValue()
        {
            return cashValue;
        }

    public int getMilesValue()
        {
            return convertToMiles(this.cashValue);
        }
}

