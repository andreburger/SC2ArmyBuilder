package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/09/26.
 */
public class Queen implements Unit {

    public String name(){return "Queen"; }

    public double damage(){
        return 8.0;
    }

    public double damageVsStrong(){return 8.0;}

    public double range() {
        return 5;
    }

    public double hp(){
        return 175.00;
    }

    public double speed(){
        return 0.93;
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

    public String weakVS(){return ""; }
}
