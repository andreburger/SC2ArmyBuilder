package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Stalker implements  Unit {

    public String name(){ return "Stalker"; }

    public double damage(){return 10.0; }

    public double damageVsStrong(){return 14.0;}

    public double range() {
        return 6.0;
    }

    public double hp(){
        return 160.00;
    }

    public double speed(){
        return 2.953;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 2;
    }

    public String type(){
        return "Armored";
    }

    public String strongVS(){
        return "Armored";
    }

    public String weakVS(){
        return "";
    }
}