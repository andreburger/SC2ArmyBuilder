package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Zealot implements  Unit{

    public String name(){ return "Zealot"; }

    public double damage(){return 16.0; }

    public double damageVsStrong(){return 16.0;}

    public double range() {
        return 0.0;
    }

    public double hp(){
        return 150.00;
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
        return "Bio";
    }

    public String strongVS(){
        return "";
    }

    public String weakVS(){
        return "";
    }
}
