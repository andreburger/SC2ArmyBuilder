package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Ghost implements Unit {

    public String name(){return "Ghost"; }

    public double damage(){
        return 10.0;
    }

    public double damageVsStrong(){return 20.0;}

    public double range() {
        return 6;
    }

    public double hp(){
        return 100.00;
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
        return "Bio";
    }

    public String weakVS(){return ""; }

}
