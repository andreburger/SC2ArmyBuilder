package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Carrier implements Unit {

    public String name(){return "Carrier"; }

    public double damage(){
        return 48.0;
    }

    public double damageVsStrong(){return 48.0;}

    public double range() {
        return 8;
    }

    public double hp(){
        return 450.00;
    }

    public double speed(){
        return 1.875;
    }

    public int armor(){
        return 2;
    }

    public int popcap(){
        return 6;
    }

    public String type(){
        return "AirMassive";
    }

    public String strongVS(){
        return "";
    }

    public String weakVS(){return ""; }
}
