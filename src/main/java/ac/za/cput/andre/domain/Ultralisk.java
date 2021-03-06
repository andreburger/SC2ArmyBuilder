package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Ultralisk implements  Unit {

    public String name(){ return "Ultralisk"; }

    public double damage(){return 15.0; }

    public double damageVsStrong()
    {
        return 35.0;
    }

    public double range() {
        return 1.0;
    }

    public double hp(){
        return 500.00;
    }

    public double speed(){
        return 2.9531;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 6;
    }

    public String type(){
        return "Massive";
    }

    public String strongVS(){
        return "Armored";
    }

    public String weakVS(){
        return "Armored";
    }
}
