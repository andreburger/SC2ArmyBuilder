package ac.za.cput.andre.domain;

/**
 * Created by student on 2015/04/26.
 */
public class Marine implements Unit{

    public String name(){ return "Marine"; }

    public double damage(){return 6.0; }

    public double damageVsStrong(){return 6.0;}

    public double range() {
        return 5.0;
    }

    public double hp(){
        return 45.0;
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
        return "";
    }

    public String weakVS(){
        return "";
    }


}
