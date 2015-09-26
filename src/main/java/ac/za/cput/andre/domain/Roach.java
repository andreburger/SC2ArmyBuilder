package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Roach implements Unit {

    public String name(){return "Roach"; }

    public double damage(){
        return 16.0;
    }

    public double damageVsStrong(){return 16.0;}

    public double range() {
        return 4;
    }

    public double hp(){
        return 145.00;
    }

    public double speed(){
        return 2.25;
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
        return "";
    }

    public String weakVS(){return ""; }
}
