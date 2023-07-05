//- Con
public class RewardValue extends RewardsConverter { /*<-- Make RewardValue a child class of the RewardsConverter,
                                                            to allow access to already declared methods/values. */

    //- Instance variables
    double uCash; //<-- Separate variable for user's cash value
    int miles; //<-- Separate variable for user's miles
    int getMilesValue(int miles)
    {
        System.out.println("Calculating miles...");
        miles = cashValue/0.0035;
        return miles;
    }

    //- Cash constructor(class type)
    public RewardValue(double cashValue)
    {
        uCash = cashValue;
    }

    //- Miles constructor(class type)
    public RewardValue()
    {
        miles = miles;
    }






}
