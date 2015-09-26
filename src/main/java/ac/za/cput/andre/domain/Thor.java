package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Thor implements  Unit {

    public String name(){ return "Thor"; }

    public double damage(){return 60.0; }

    public double damageVsStrong(){return 60.0;}

    public double range() {
        return 7.0;
    }

    public double hp(){
        return 400.00;
    }

    public double speed(){
        return 1.875;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 5;
    }

    public String type(){
        return "Massive";
    }

    public String strongVS(){
        return "Armored";
    }

    public String weakVS(){
        return "";
    }
}
