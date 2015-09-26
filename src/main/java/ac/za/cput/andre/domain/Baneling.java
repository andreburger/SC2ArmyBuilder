package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Baneling implements Unit {

    public String name(){return "Baneling"; }

    public double damage(){
        return 20.0;
    }

    public double damageVsStrong(){return 35.0;}

    public double range() {
        return 6;
    }

    public double hp(){
        return 30.00;
    }

    public double speed(){
        return 2.25;
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
        return "Light";
    }

    public String weakVS(){return ""; }
}
