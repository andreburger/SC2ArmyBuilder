package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Mutalisk implements  Unit {

    public String name(){ return "Mutalisk"; }

    public double damage(){return 9.0; }

    public double damageVsStrong()
    {
        return 9.0;
    }

    public double range() {
        return 3.0;
    }

    public double hp(){
        return 120.00;
    }

    public double speed(){
        return 3.75;
    }

    public int armor(){
        return 3;
    }

    public int popcap(){
        return 2;
    }

    public String type(){
        return "AirBio";
    }

    public String strongVS(){
        return "";
    }

    public String weakVS(){
        return "";
    }
}