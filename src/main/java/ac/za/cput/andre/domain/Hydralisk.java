package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Hydralisk implements  Unit{

    public String name(){ return "Hydralisk"; }

    public double damage(){return 12.0; }

    public double damageVsStrong()
    {
        return 12.0;
    }

    public double range() {
        return 500.0;
    }

    public double hp(){
        return 80.00;
    }

    public double speed(){
        return 2.25;
    }

    public int armor(){
        return 0;
    }

    public int popcap(){
        return 2;
    }

    public String type(){
        return "Bio";
    }

    public String strongVS(){
        return "Air";
    }

    public String weakVS(){
        return "";
    }
}
