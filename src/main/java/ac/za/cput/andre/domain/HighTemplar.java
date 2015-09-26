package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class HighTemplar implements Unit{

    public String name(){ return "High Templar"; }

    public double damage(){return 80.0; }

    public double damageVsStrong()
    {
        return 80.0;
    }

    public double range() {
        return 9;
    }

    public double hp(){
        return 80.00;
    }

    public double speed(){
        return 1.875;
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
        return "";
    }

    public String weakVS(){
        return "";
    }
}
