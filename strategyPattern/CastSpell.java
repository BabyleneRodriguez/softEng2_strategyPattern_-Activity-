package softEng2_LabAss2_strategyPattern;

public class CastSpell implements AttackStrategy
{
    public String attack()
    {
        String output = new String();
        output += " casts a spell!";

        return output;
    }
}
