package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Zergling implements  Unit{

    public String name(){ return "Zergling"; }

    public double damage(){return 5.0; }

    public double damageVsStrong()
    {
        return 5.0;
    }
    public double range() {
        return 0.1;
    }

    public double hp(){
        return 35.00;
    }

    public double speed(){
        return 2.9531;
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
        return "";
    }

    public String weakVS(){
        return "";
    }
}
