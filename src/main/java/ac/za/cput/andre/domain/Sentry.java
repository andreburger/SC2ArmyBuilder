package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Sentry implements Unit {

    public String name(){ return "Sentry"; }

    public double damage(){return 6.0; }

    public double damageVsStrong()
    {
        return 6.0;
    }

    public double range() {
        return 5;
    }

    public double hp(){
        return 80.00;
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

    public String weakVS(){
        return "";
    }
}
