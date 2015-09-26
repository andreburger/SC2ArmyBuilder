package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Pheonix implements Unit {
    public String name(){ return "Pheonix"; }

    public double damage(){return 10.0; }

    public double damageVsStrong()
    {
        return 20.0;
    }

    public double range() {
        return 5;
    }

    public double hp(){
        return 180.00;
    }

    public double speed(){
        return 4.25;
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
        return "Bio";
    }

    public String weakVS(){
        return "";
    }
}
