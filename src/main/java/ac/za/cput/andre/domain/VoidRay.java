package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class VoidRay implements Unit {

    public String name(){ return "Void Ray"; }

    public double damage(){return 6.0; }

    public double damageVsStrong()
    {
        return 10.0;
    }

    public double range() {
        return 6;
    }

    public double hp(){
        return 250.00;
    }

    public double speed(){
        return 2.25;
    }

    public int armor(){
        return 0;
    }

    public int popcap(){
        return 3;
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
