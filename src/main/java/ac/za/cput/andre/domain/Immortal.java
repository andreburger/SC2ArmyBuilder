package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Immortal implements  Unit {

    public String name(){ return "Immortal"; }

    public double damage(){return 20.0; }

    public double damageVsStrong(){return 50.0;}

    public double range() {
        return 6;
    }

    public double hp(){
        return 300;
    }

    public double speed(){
        return 2.25;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 4;
    }

    public String type(){
        return "Armored";
    }

    public String strongVS(){
        return "Armored";
    }

    public String weakVS(){
        return "Bio";
    }
}