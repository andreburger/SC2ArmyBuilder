package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Corruptor implements Unit {

    public String name(){return "Corruptor"; }

    public double damage(){
        return 14.0;
    }

    public double damageVsStrong(){return 20.0;}

    public double range() {
        return 6;
    }

    public double hp(){
        return 200.00;
    }

    public double speed(){
        return 2.95;
    }

    public int armor(){
        return 2;
    }

    public int popcap(){
        return 2;
    }

    public String type(){
        return "AirArmored";
    }

    public String strongVS(){
        return "Massive";
    }

    public String weakVS(){return ""; }
}
