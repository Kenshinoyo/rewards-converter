//- When RewardsConverter file is ran, conversion value equals zero. Further testing is needed.

public class RewardValueRough extends RewardsConverter {

    //- Instance variables/attributes
    double uCash; //<-- Local variable for user's cash value
    int uMiles; //<-- Local variable for user's miles


    //- Miles constructor(class type)
    public RewardValueRough(int miles) //<-- Integer parameter passed as argument in constructor for the sake of initializing "uMiles"
    {
        uMiles = miles;
    }

    //- Cash constructor(class type)
    public RewardValueRough(double cash) //<-- Double parameter passed as argument in constructor for the sake of initializing "uCash"
    {
        uCash = cash;
    }

    public int getMilesValue()
    {
        uMiles = (int)(uCash/0.0035); //<-- Cash converts to miles at 0.35%
        System.out.println(uMiles);
        return uMiles;
    }

    public double getCashValue()
    {
        uCash = uMiles*0.0035;
        System.out.println(uCash);
        return uMiles;
    }
    public static void main(String[] args) {

        //        RewardValue myMiles = new RewardValue();

    }

}
