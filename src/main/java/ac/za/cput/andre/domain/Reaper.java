package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Reaper implements Unit {

    public String name(){return "Reaper"; }

    public double damage(){
        return 4.0;
    }

    public double damageVsStrong(){return 9.0;}

    public double range() {
        return 4.5;
    }

    public double hp(){
        return 60.00;
    }

    public double speed(){
        return 2.93;
    }

    public int armor(){
        return 0;
    }

    public int popcap(){
        return 1;
    }

    public String type(){
        return "Bio";
    }

    public String strongVS(){
        return "Bio";
    }

    public String weakVS(){return ""; }
}
