package ac.za.cput.andre.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by student on 2015/04/26.
 */
@Entity
public class Protoss implements Race,Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String armyName;
    int armyPop;
    @Column(length = 8000)
    private ArrayList<HashMap<String,String>> armyunits = new ArrayList();
    String user;

    public Protoss()
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
    public String getArmyName()
    {
        return armyName;
    }

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
        if(name.equals("Zealot"))
        {
            Zealot zealot = new Zealot();

            unit.put("name",zealot.name());
            unit.put("damage",String.valueOf(zealot.damage()));
            unit.put("damageVsStrong",String.valueOf(zealot.damageVsStrong()));
            unit.put("range",String.valueOf(zealot.range()));
            unit.put("hp",String.valueOf(zealot.hp()));
            unit.put("speed",String.valueOf(zealot.speed()));
            unit.put("armor",String.valueOf(zealot.armor()));
            unit.put("popcap",String.valueOf(zealot.popcap()));
            unit.put("type",zealot.type());
            unit.put("strongVS",zealot.strongVS());
            unit.put("weakVS",zealot.weakVS());

            armyunits.add(unit);
            return zealot;
        }
        else  if(name.equals("Colossus"))
        {
            Colossus colossus = new Colossus();
            unit.put("name", colossus.name());
            unit.put("damage", String.valueOf(colossus.damage()));
            unit.put("damageVsStrong",String.valueOf(colossus.damageVsStrong()));
            unit.put("range", String.valueOf(colossus.range()));
            unit.put("hp", String.valueOf(colossus.hp()));
            unit.put("speed", String.valueOf(colossus.speed()));
            unit.put("armor", String.valueOf(colossus.armor()));
            unit.put("popcap", String.valueOf(colossus.popcap()));
            unit.put("type", colossus.type());
            unit.put("strongVS", colossus.strongVS());
            unit.put("weakVS", colossus.weakVS());

            armyunits.add(unit);
            return colossus;
        }
        else if(name.equals("Stalker"))
        {
            Stalker stalker = new Stalker();
            unit.put("name", stalker.name());
            unit.put("damage", String.valueOf(stalker.damage()));
            unit.put("damageVsStrong",String.valueOf(stalker.damageVsStrong()));
            unit.put("range", String.valueOf(stalker.range()));
            unit.put("hp", String.valueOf(stalker.hp()));
            unit.put("speed", String.valueOf(stalker.speed()));
            unit.put("armor", String.valueOf(stalker.armor()));
            unit.put("popcap", String.valueOf(stalker.popcap()));
            unit.put("type", stalker.type());
            unit.put("strongVS", stalker.strongVS());
            unit.put("weakVS", stalker.weakVS());

            armyunits.add(unit);
            return stalker;
        }
        else if(name.equals("Immortal"))
        {
            Immortal immortal = new Immortal();
            unit.put("name", immortal.name());
            unit.put("damage", String.valueOf(immortal.damage()));
            unit.put("damageVsStrong",String.valueOf(immortal.damageVsStrong()));
            unit.put("range", String.valueOf(immortal.range()));
            unit.put("hp", String.valueOf(immortal.hp()));
            unit.put("speed", String.valueOf(immortal.speed()));
            unit.put("armor", String.valueOf(immortal.armor()));
            unit.put("popcap", String.valueOf(immortal.popcap()));
            unit.put("type", immortal.type());
            unit.put("strongVS", immortal.strongVS());
            unit.put("weakVS", immortal.weakVS());

            armyunits.add(unit);
            return immortal;
        }
        else if(name.equals("Archon"))
        {
            Archon archon = new Archon();
            unit.put("name", archon.name());
            unit.put("damage", String.valueOf(archon.damage()));
            unit.put("damageVsStrong",String.valueOf(archon.damageVsStrong()));
            unit.put("range", String.valueOf(archon.range()));
            unit.put("hp", String.valueOf(archon.hp()));
            unit.put("speed", String.valueOf(archon.speed()));
            unit.put("armor", String.valueOf(archon.armor()));
            unit.put("popcap", String.valueOf(archon.popcap()));
            unit.put("type", archon.type());
            unit.put("strongVS", archon.strongVS());
            unit.put("weakVS", archon.weakVS());

            armyunits.add(unit);
            return archon;
        }
        else if(name.equals("Dark Templar"))
        {
            DarkTemplar darkTemplar = new DarkTemplar();
            unit.put("name", darkTemplar.name());
            unit.put("damage", String.valueOf(darkTemplar.damage()));
            unit.put("damageVsStrong",String.valueOf(darkTemplar.damageVsStrong()));
            unit.put("range", String.valueOf(darkTemplar.range()));
            unit.put("hp", String.valueOf(darkTemplar.hp()));
            unit.put("speed", String.valueOf(darkTemplar.speed()));
            unit.put("armor", String.valueOf(darkTemplar.armor()));
            unit.put("popcap", String.valueOf(darkTemplar.popcap()));
            unit.put("type", darkTemplar.type());
            unit.put("strongVS", darkTemplar.strongVS());
            unit.put("weakVS", darkTemplar.weakVS());

            armyunits.add(unit);
            return darkTemplar;
        }
        else if(name.equals("High Templar"))
        {
            HighTemplar highTemplar = new HighTemplar();
            unit.put("name", highTemplar.name());
            unit.put("damage", String.valueOf(highTemplar.damage()));
            unit.put("damageVsStrong",String.valueOf(highTemplar.damageVsStrong()));
            unit.put("range", String.valueOf(highTemplar.range()));
            unit.put("hp", String.valueOf(highTemplar.hp()));
            unit.put("speed", String.valueOf(highTemplar.speed()));
            unit.put("armor", String.valueOf(highTemplar.armor()));
            unit.put("popcap", String.valueOf(highTemplar.popcap()));
            unit.put("type", highTemplar.type());
            unit.put("strongVS", highTemplar.strongVS());
            unit.put("weakVS", highTemplar.weakVS());

            armyunits.add(unit);
            return highTemplar;
        }
        else if(name.equals("Pheonix"))
        {
            Pheonix pheonix = new Pheonix();
            unit.put("name", pheonix.name());
            unit.put("damage", String.valueOf(pheonix.damage()));
            unit.put("damageVsStrong",String.valueOf(pheonix.damageVsStrong()));
            unit.put("range", String.valueOf(pheonix.range()));
            unit.put("hp", String.valueOf(pheonix.hp()));
            unit.put("speed", String.valueOf(pheonix.speed()));
            unit.put("armor", String.valueOf(pheonix.armor()));
            unit.put("popcap", String.valueOf(pheonix.popcap()));
            unit.put("type", pheonix.type());
            unit.put("strongVS", pheonix.strongVS());
            unit.put("weakVS", pheonix.weakVS());

            armyunits.add(unit);
            return pheonix;
        }
        else if(name.equals("Sentry"))
        {
            Sentry sentry = new Sentry();
            unit.put("name", sentry.name());
            unit.put("damage", String.valueOf(sentry.damage()));
            unit.put("damageVsStrong",String.valueOf(sentry.damageVsStrong()));
            unit.put("range", String.valueOf(sentry.range()));
            unit.put("hp", String.valueOf(sentry.hp()));
            unit.put("speed", String.valueOf(sentry.speed()));
            unit.put("armor", String.valueOf(sentry.armor()));
            unit.put("popcap", String.valueOf(sentry.popcap()));
            unit.put("type", sentry.type());
            unit.put("strongVS", sentry.strongVS());
            unit.put("weakVS", sentry.weakVS());

            armyunits.add(unit);
            return sentry;
        }
        else if(name.equals("Void Ray"))
        {
            VoidRay voidRay = new VoidRay();
            unit.put("name", voidRay.name());
            unit.put("damage", String.valueOf(voidRay.damage()));
            unit.put("damageVsStrong",String.valueOf(voidRay.damageVsStrong()));
            unit.put("range", String.valueOf(voidRay.range()));
            unit.put("hp", String.valueOf(voidRay.hp()));
            unit.put("speed", String.valueOf(voidRay.speed()));
            unit.put("armor", String.valueOf(voidRay.armor()));
            unit.put("popcap", String.valueOf(voidRay.popcap()));
            unit.put("type", voidRay.type());
            unit.put("strongVS", voidRay.strongVS());
            unit.put("weakVS", voidRay.weakVS());

            armyunits.add(unit);
            return voidRay;
        }
        else if(name.equals("Carrier"))
        {
            Carrier carrier = new Carrier();
            unit.put("name", carrier.name());
            unit.put("damage", String.valueOf(carrier.damage()));
            unit.put("damageVsStrong",String.valueOf(carrier.damageVsStrong()));
            unit.put("range", String.valueOf(carrier.range()));
            unit.put("hp", String.valueOf(carrier.hp()));
            unit.put("speed", String.valueOf(carrier.speed()));
            unit.put("armor", String.valueOf(carrier.armor()));
            unit.put("popcap", String.valueOf(carrier.popcap()));
            unit.put("type", carrier.type());
            unit.put("strongVS", carrier.strongVS());
            unit.put("weakVS", carrier.weakVS());

            armyunits.add(unit);
            return carrier;
        }
        else
            return null;

    }


}
