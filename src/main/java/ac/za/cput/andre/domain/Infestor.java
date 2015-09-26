package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Infestor implements Unit {

    public String name(){return "Infestor"; }

    public double damage(){
        return 30.0;
    }

    public double damageVsStrong(){return 30.0;}

    public double range() {
        return 10;
    }

    public double hp(){
        return 90.00;
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
        return "";
    }

    public String weakVS(){return ""; }
}
