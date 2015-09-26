package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class DarkTemplar implements Unit {
    public String name(){ return "Dark Templar"; }

    public double damage(){return 45.0; }

    public double damageVsStrong()
    {
        return 45.0;
    }

    public double range() {
        return 0.1;
    }

    public double hp(){
        return 80.00;
    }

    public double speed(){
        return 2.8;
    }

    public int armor(){
        return 1;
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
