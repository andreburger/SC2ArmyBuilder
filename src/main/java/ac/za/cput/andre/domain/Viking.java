package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Viking implements  Unit {

    public String name(){ return "Viking"; }

    public double damage(){return 20.0; }

    public double damageVsStrong(){return 28.0;}

    public double range() {
        return 9.0;
    }

    public double hp(){
        return 125.00;
    }

    public double speed(){
        return 2.75;
    }

    public int armor(){
        return 0;
    }

    public int popcap(){
        return 2;
    }

    public String type(){
        return "AirArmored";
    }

    public String strongVS(){
        return "Armored";
    }

    public String weakVS(){
        return "Armored";
    }
}
