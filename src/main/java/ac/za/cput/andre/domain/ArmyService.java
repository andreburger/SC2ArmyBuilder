package ac.za.cput.andre.domain;

import java.util.List;

/**
 * Created by student on 2015/09/27.
 */
public class ArmyService {

    private List<String> army;
    private String race;
    private String armyname;
    private String email;

    public List<String> getArmy()
    {
        return army;
    }
    public void setArmy(List<String> value)
    {
        this.army = value;
    }

    public String getRace()
    {
        return race;
    }
    public void setRace(String value)
    {
        this.race = value;
    }

    public String getArmyname()
    {
        return armyname;
    }
    public void setArmyname(String value)
    {
        this.armyname = value;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String value)
    {
        this.email = value;
    }




}
