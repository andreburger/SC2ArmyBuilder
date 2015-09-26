package ac.za.cput.andre.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by student on 2015/04/26.
 */
@Entity
public class Zerg implements  Race,Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String armyName;
    int armyPop;
    @Column(length = 8000)
    private ArrayList<HashMap<String,String>> armyunits = new ArrayList();
    String user;

    public Zerg()
    {

    }

    public long getID()
    {
        return id;
    }
    public void setID(long id)
    {
        this.id = id;
    }
    public void setArmyName(String nm)
    {
        armyName = nm;
    }

    public void setArmyPop(int pop)
    {
        armyPop = pop;
    }

    public String getArmyName(){return armyName;}
    public void setUser(String user)
    {
        this.user = user;
    }

    public String getUser()
    {
        return user;
    }
    public  ArrayList<HashMap<String,String>> getArmy()
    {
        return armyunits;
    }

    public Unit addUnit(String name)
    {
        HashMap<String,String> unit = new HashMap();
        if(name.equals("Zergling"))
        {
            Zergling zergling = new Zergling();

            unit.put("name",zergling.name());
            unit.put("damage",String.valueOf(zergling.damage()));
            unit.put("damageVsStrong",String.valueOf(zergling.damageVsStrong()));
            unit.put("range",String.valueOf(zergling.range()));
            unit.put("hp",String.valueOf(zergling.hp()));
            unit.put("speed",String.valueOf(zergling.speed()));
            unit.put("armor",String.valueOf(zergling.armor()));
            unit.put("popcap",String.valueOf(zergling.popcap()));
            unit.put("type",zergling.type());
            unit.put("strongVS",zergling.strongVS());
            unit.put("weakVS",zergling.weakVS());

            armyunits.add(unit);

            return zergling;
        }
        else if(name.equals("Hydralisk"))
        {
            Hydralisk hydralisk = new Hydralisk();

            unit.put("name",hydralisk.name());
            unit.put("damage",String.valueOf(hydralisk.damage()));
            unit.put("damageVsStrong",String.valueOf(hydralisk.damageVsStrong()));
            unit.put("range",String.valueOf(hydralisk.range()));
            unit.put("hp",String.valueOf(hydralisk.hp()));
            unit.put("speed",String.valueOf(hydralisk.speed()));
            unit.put("armor",String.valueOf(hydralisk.armor()));
            unit.put("popcap",String.valueOf(hydralisk.popcap()));
            unit.put("type",hydralisk.type());
            unit.put("strongVS",hydralisk.strongVS());
            unit.put("weakVS",hydralisk.weakVS());

            armyunits.add(unit);

            return hydralisk;
        }
        else if(name.equals("Ultralisk"))
        {
            Ultralisk ultralisk = new Ultralisk();

            unit.put("name",ultralisk.name());
            unit.put("damage",String.valueOf(ultralisk.damage()));
            unit.put("damageVsStrong",String.valueOf(ultralisk.damageVsStrong()));
            unit.put("range",String.valueOf(ultralisk.range()));
            unit.put("hp",String.valueOf(ultralisk.hp()));
            unit.put("speed",String.valueOf(ultralisk.speed()));
            unit.put("armor",String.valueOf(ultralisk.armor()));
            unit.put("popcap",String.valueOf(ultralisk.popcap()));
            unit.put("type",ultralisk.type());
            unit.put("strongVS",ultralisk.strongVS());
            unit.put("weakVS",ultralisk.weakVS());

            armyunits.add(unit);

            return ultralisk;
        }
        else if(name.equals("Mutalisk"))
        {
            Mutalisk mutalisk = new Mutalisk();

            unit.put("name",mutalisk.name());
            unit.put("damage",String.valueOf(mutalisk.damage()));
            unit.put("damageVsStrong",String.valueOf(mutalisk.damageVsStrong()));
            unit.put("range",String.valueOf(mutalisk.range()));
            unit.put("hp",String.valueOf(mutalisk.hp()));
            unit.put("speed",String.valueOf(mutalisk.speed()));
            unit.put("armor",String.valueOf(mutalisk.armor()));
            unit.put("popcap",String.valueOf(mutalisk.popcap()));
            unit.put("type",mutalisk.type());
            unit.put("strongVS",mutalisk.strongVS());
            unit.put("weakVS",mutalisk.weakVS());

            armyunits.add(unit);

            return mutalisk;
        }
        else if(name.equals("Baneling"))
        {
            Baneling baneling = new Baneling();

            unit.put("name",baneling.name());
            unit.put("damage",String.valueOf(baneling.damage()));
            unit.put("damageVsStrong",String.valueOf(baneling.damageVsStrong()));
            unit.put("range",String.valueOf(baneling.range()));
            unit.put("hp",String.valueOf(baneling.hp()));
            unit.put("speed",String.valueOf(baneling.speed()));
            unit.put("armor",String.valueOf(baneling.armor()));
            unit.put("popcap",String.valueOf(baneling.popcap()));
            unit.put("type",baneling.type());
            unit.put("strongVS",baneling.strongVS());
            unit.put("weakVS",baneling.weakVS());

            armyunits.add(unit);

            return baneling;
        }
        else if(name.equals("Broodlord"))
        {
            Broodlord broodlord = new Broodlord();

            unit.put("name",broodlord.name());
            unit.put("damage",String.valueOf(broodlord.damage()));
            unit.put("damageVsStrong",String.valueOf(broodlord.damageVsStrong()));
            unit.put("range",String.valueOf(broodlord.range()));
            unit.put("hp",String.valueOf(broodlord.hp()));
            unit.put("speed",String.valueOf(broodlord.speed()));
            unit.put("armor",String.valueOf(broodlord.armor()));
            unit.put("popcap",String.valueOf(broodlord.popcap()));
            unit.put("type",broodlord.type());
            unit.put("strongVS",broodlord.strongVS());
            unit.put("weakVS",broodlord.weakVS());

            armyunits.add(unit);

            return broodlord;
        }
        else if(name.equals("Corruptor"))
        {
            Corruptor corruptor = new Corruptor();

            unit.put("name",corruptor.name());
            unit.put("damage",String.valueOf(corruptor.damage()));
            unit.put("damageVsStrong",String.valueOf(corruptor.damageVsStrong()));
            unit.put("range",String.valueOf(corruptor.range()));
            unit.put("hp",String.valueOf(corruptor.hp()));
            unit.put("speed",String.valueOf(corruptor.speed()));
            unit.put("armor",String.valueOf(corruptor.armor()));
            unit.put("popcap",String.valueOf(corruptor.popcap()));
            unit.put("type",corruptor.type());
            unit.put("strongVS",corruptor.strongVS());
            unit.put("weakVS",corruptor.weakVS());

            armyunits.add(unit);

            return corruptor;
        }
        else if(name.equals("Infestor"))
        {
            Infestor infestor = new Infestor();

            unit.put("name",infestor.name());
            unit.put("damage",String.valueOf(infestor.damage()));
            unit.put("damageVsStrong",String.valueOf(infestor.damageVsStrong()));
            unit.put("range",String.valueOf(infestor.range()));
            unit.put("hp",String.valueOf(infestor.hp()));
            unit.put("speed",String.valueOf(infestor.speed()));
            unit.put("armor",String.valueOf(infestor.armor()));
            unit.put("popcap",String.valueOf(infestor.popcap()));
            unit.put("type",infestor.type());
            unit.put("strongVS",infestor.strongVS());
            unit.put("weakVS",infestor.weakVS());

            armyunits.add(unit);

            return infestor;
        }
        else if(name.equals("Queen"))
        {
            Queen queen = new Queen();

            unit.put("name",queen.name());
            unit.put("damage",String.valueOf(queen.damage()));
            unit.put("damageVsStrong",String.valueOf(queen.damageVsStrong()));
            unit.put("range",String.valueOf(queen.range()));
            unit.put("hp",String.valueOf(queen.hp()));
            unit.put("speed",String.valueOf(queen.speed()));
            unit.put("armor",String.valueOf(queen.armor()));
            unit.put("popcap",String.valueOf(queen.popcap()));
            unit.put("type",queen.type());
            unit.put("strongVS",queen.strongVS());
            unit.put("weakVS",queen.weakVS());

            armyunits.add(unit);

            return queen;
        }
        else if(name.equals("Roach"))
        {
            Roach roach = new Roach();

            unit.put("name",roach.name());
            unit.put("damage",String.valueOf(roach.damage()));
            unit.put("damageVsStrong",String.valueOf(roach.damageVsStrong()));
            unit.put("range",String.valueOf(roach.range()));
            unit.put("hp",String.valueOf(roach.hp()));
            unit.put("speed",String.valueOf(roach.speed()));
            unit.put("armor",String.valueOf(roach.armor()));
            unit.put("popcap",String.valueOf(roach.popcap()));
            unit.put("type",roach.type());
            unit.put("strongVS",roach.strongVS());
            unit.put("weakVS",roach.weakVS());

            armyunits.add(unit);

            return roach;
        }
        else
            return null;
    }

}
