package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Broodlord implements Unit {

    public String name(){return "Broodlord"; }

    public double damage(){
        return 40.0;
    }

    public double damageVsStrong(){return 40.0;}

    public double range() {
        return 9.5;
    }

    public double hp(){
        return 225.00;
    }

    public double speed(){
        return 1.4;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 4;
    }

    public String type(){
        return "AirMassive";
    }

    public String strongVS(){
        return "";
    }

    public String weakVS(){return ""; }
}
