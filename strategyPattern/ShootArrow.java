package softEng2_LabAss2_strategyPattern;

public class ShootArrow implements AttackStrategy
{
    public String attack()
    {
        String output = new String();
        output += " shoots an arrow!";

        return output;
    }
}
