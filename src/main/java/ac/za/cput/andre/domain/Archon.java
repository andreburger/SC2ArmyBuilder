package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Archon implements Unit  {

    public String name(){return "Archon"; }

    public double damage(){
        return 25.0;
    }

    public double damageVsStrong(){return 35.0;}

    public double range() {
        return 3;
    }

    public double hp(){
        return 360.00;
    }

    public double speed(){
        return 2.8;
    }

    public int armor(){
        return 0;
    }

    public int popcap(){
        return 4;
    }

    public String type(){
        return "";
    }

    public String strongVS(){
        return "Bio";
    }

    public String weakVS(){return ""; }
}
