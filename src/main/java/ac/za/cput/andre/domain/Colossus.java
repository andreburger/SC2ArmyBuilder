package ac.za.cput.andre.domain;
/**
 * Created by student on 2015/04/26.
 */
public class Colossus implements Unit {

    public String name(){return "Colossus"; }

    public double damage(){
        return 30.0;
    }

    public double damageVsStrong(){return 30.0;}

    public double range() {
        return 6;
    }

    public double hp(){
        return 350.00;
    }

    public double speed(){
        return 2.25;
    }

    public int armor(){
        return 1;
    }

    public int popcap(){
        return 6;
    }

    public String type(){
        return "Massive";
    }

    public String strongVS(){
        return "Bio";
    }

    public String weakVS(){return "Air"; }
}
