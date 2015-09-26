package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class SiegeTank implements Unit {

    public String name(){return "Siege Tank"; }

    public double damage(){
        return 35.0;
    }

    public double damageVsStrong(){return 50.0;}

    public double range() {
        return 13;
    }

    public double hp(){
        return 160.00;
    }

    public double speed(){
        return 2.25;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 3;
    }

    public String type(){
        return "Armored";
    }

    public String strongVS(){
        return "Armored";
    }

    public String weakVS(){return "Armored"; }
}
