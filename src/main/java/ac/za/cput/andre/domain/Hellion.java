package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Hellion implements Unit {

    public String name(){return "Hellion"; }

    public double damage(){
        return 8.0;
    }

    public double damageVsStrong(){return 14.0;}

    public double range() {
        return 5;
    }

    public double hp(){
        return 90.00;
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
        return "Armored";
    }

    public String strongVS(){
        return "Bio";
    }

    public String weakVS(){return ""; }
}
