package ac.za.cput.andre.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by student on 2015/04/26.
 */
@Entity
public class Terran implements Race,Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String armyName;
    int armyPop;
    @Column(length = 8000)
    private ArrayList<HashMap<String,String>> armyunits = new ArrayList();
    String user;

    public Terran()
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
    public ArrayList<HashMap<String,String>> getArmy()
    {
        return armyunits;
    }
    public Unit addUnit(String name)
    {
        HashMap<String,String> unit = new HashMap();
        if(name.equals("Marine"))
        {
            Marine marine = new Marine();
            unit.put("name", marine.name());
            unit.put("damage", String.valueOf(marine.damage()));
            unit.put("damageVsStrong",String.valueOf(marine.damageVsStrong()));
            unit.put("range", String.valueOf(marine.range()));
            unit.put("hp", String.valueOf(marine.hp()));
            unit.put("speed", String.valueOf(marine.speed()));
            unit.put("armor", String.valueOf(marine.armor()));
            unit.put("popcap", String.valueOf(marine.popcap()));
            unit.put("type", marine.type());
            unit.put("strongVS", marine.strongVS());
            unit.put("weakVS", marine.weakVS());

            armyunits.add(unit);
            return marine;
        }
        else  if(name.equals("Thor"))
        {
            Thor thor = new Thor();
            unit.put("name", thor.name());
            unit.put("damage", String.valueOf(thor.damage()));
            unit.put("damageVsStrong",String.valueOf(thor.damageVsStrong()));
            unit.put("range", String.valueOf(thor.range()));
            unit.put("hp", String.valueOf(thor.hp()));
            unit.put("speed", String.valueOf(thor.speed()));
            unit.put("armor", String.valueOf(thor.armor()));
            unit.put("popcap", String.valueOf(thor.popcap()));
            unit.put("type", thor.type());
            unit.put("strongVS", thor.strongVS());
            unit.put("weakVS", thor.weakVS());

            armyunits.add(unit);
            return thor;
        }
        else if(name.equals("Marauder"))
        {
            Marauder marauder = new Marauder();
            unit.put("name", marauder.name());
            unit.put("damage", String.valueOf(marauder.damage()));
            unit.put("damageVsStrong",String.valueOf(marauder.damageVsStrong()));
            unit.put("range", String.valueOf(marauder.range()));
            unit.put("hp", String.valueOf(marauder.hp()));
            unit.put("speed", String.valueOf(marauder.speed()));
            unit.put("armor", String.valueOf(marauder.armor()));
            unit.put("popcap", String.valueOf(marauder.popcap()));
            unit.put("type", marauder.type());
            unit.put("strongVS", marauder.strongVS());
            unit.put("weakVS", marauder.weakVS());

            armyunits.add(unit);
            return marauder;
        }
        else if(name.equals("Viking"))
        {
            Viking viking = new Viking();
            unit.put("name", viking.name());
            unit.put("damage", String.valueOf(viking.damage()));
            unit.put("damageVsStrong",String.valueOf(viking.damageVsStrong()));
            unit.put("range", String.valueOf(viking.range()));
            unit.put("hp", String.valueOf(viking.hp()));
            unit.put("speed", String.valueOf(viking.speed()));
            unit.put("armor", String.valueOf(viking.armor()));
            unit.put("popcap", String.valueOf(viking.popcap()));
            unit.put("type", viking.type());
            unit.put("strongVS", viking.strongVS());
            unit.put("weakVS", viking.weakVS());

            armyunits.add(unit);
            return viking;
        }
        else if(name.equals("Banshee"))
        {
            Banshee banshee = new Banshee();
            unit.put("name", banshee.name());
            unit.put("damage", String.valueOf(banshee.damage()));
            unit.put("damageVsStrong",String.valueOf(banshee.damageVsStrong()));
            unit.put("range", String.valueOf(banshee.range()));
            unit.put("hp", String.valueOf(banshee.hp()));
            unit.put("speed", String.valueOf(banshee.speed()));
            unit.put("armor", String.valueOf(banshee.armor()));
            unit.put("popcap", String.valueOf(banshee.popcap()));
            unit.put("type", banshee.type());
            unit.put("strongVS", banshee.strongVS());
            unit.put("weakVS", banshee.weakVS());

            armyunits.add(unit);
            return banshee;
        }
        else if(name.equals("Battlecruiser"))
        {
            Battlecruiser battlecruiser = new Battlecruiser();
            unit.put("name", battlecruiser.name());
            unit.put("damage", String.valueOf(battlecruiser.damage()));
            unit.put("damageVsStrong",String.valueOf(battlecruiser.damageVsStrong()));
            unit.put("range", String.valueOf(battlecruiser.range()));
            unit.put("hp", String.valueOf(battlecruiser.hp()));
            unit.put("speed", String.valueOf(battlecruiser.speed()));
            unit.put("armor", String.valueOf(battlecruiser.armor()));
            unit.put("popcap", String.valueOf(battlecruiser.popcap()));
            unit.put("type", battlecruiser.type());
            unit.put("strongVS", battlecruiser.strongVS());
            unit.put("weakVS", battlecruiser.weakVS());

            armyunits.add(unit);
            return battlecruiser;
        }
        else if(name.equals("Ghost"))
        {
            Ghost ghost = new Ghost();
            unit.put("name", ghost.name());
            unit.put("damage", String.valueOf(ghost.damage()));
            unit.put("damageVsStrong",String.valueOf(ghost.damageVsStrong()));
            unit.put("range", String.valueOf(ghost.range()));
            unit.put("hp", String.valueOf(ghost.hp()));
            unit.put("speed", String.valueOf(ghost.speed()));
            unit.put("armor", String.valueOf(ghost.armor()));
            unit.put("popcap", String.valueOf(ghost.popcap()));
            unit.put("type", ghost.type());
            unit.put("strongVS", ghost.strongVS());
            unit.put("weakVS", ghost.weakVS());

            armyunits.add(unit);
            return ghost;
        }
        else if(name.equals("Hellion"))
        {
            Hellion hellion = new Hellion();
            unit.put("name", hellion.name());
            unit.put("damage", String.valueOf(hellion.damage()));
            unit.put("damageVsStrong",String.valueOf(hellion.damageVsStrong()));
            unit.put("range", String.valueOf(hellion.range()));
            unit.put("hp", String.valueOf(hellion.hp()));
            unit.put("speed", String.valueOf(hellion.speed()));
            unit.put("armor", String.valueOf(hellion.armor()));
            unit.put("popcap", String.valueOf(hellion.popcap()));
            unit.put("type", hellion.type());
            unit.put("strongVS", hellion.strongVS());
            unit.put("weakVS", hellion.weakVS());

            armyunits.add(unit);
            return hellion;
        }
        else if(name.equals("Reaper"))
        {
            Reaper reaper = new Reaper();
            unit.put("name", reaper.name());
            unit.put("damage", String.valueOf(reaper.damage()));
            unit.put("damageVsStrong",String.valueOf(reaper.damageVsStrong()));
            unit.put("range", String.valueOf(reaper.range()));
            unit.put("hp", String.valueOf(reaper.hp()));
            unit.put("speed", String.valueOf(reaper.speed()));
            unit.put("armor", String.valueOf(reaper.armor()));
            unit.put("popcap", String.valueOf(reaper.popcap()));
            unit.put("type", reaper.type());
            unit.put("strongVS", reaper.strongVS());
            unit.put("weakVS", reaper.weakVS());

            armyunits.add(unit);
            return reaper;
        }
        else if(name.equals("Siege Tank"))
        {
            SiegeTank siegeTank = new SiegeTank();
            unit.put("name", siegeTank.name());
            unit.put("damage", String.valueOf(siegeTank.damage()));
            unit.put("damageVsStrong",String.valueOf(siegeTank.damageVsStrong()));
            unit.put("range", String.valueOf(siegeTank.range()));
            unit.put("hp", String.valueOf(siegeTank.hp()));
            unit.put("speed", String.valueOf(siegeTank.speed()));
            unit.put("armor", String.valueOf(siegeTank.armor()));
            unit.put("popcap", String.valueOf(siegeTank.popcap()));
            unit.put("type", siegeTank.type());
            unit.put("strongVS", siegeTank.strongVS());
            unit.put("weakVS", siegeTank.weakVS());

            armyunits.add(unit);
            return siegeTank;
        }
        else
            return null;
    }

}
