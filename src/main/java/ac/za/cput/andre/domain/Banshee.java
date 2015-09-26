package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Banshee implements Unit {

    public String name(){return "Banshee"; }

    public double damage(){
        return 24.0;
    }

    public double damageVsStrong(){return 24.0;}

    public double range() {
        return 6;
    }

    public double hp(){
        return 140.00;
    }

    public double speed(){
        return 2.75;
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
        return "";
    }

    public String weakVS(){return ""; }
}
