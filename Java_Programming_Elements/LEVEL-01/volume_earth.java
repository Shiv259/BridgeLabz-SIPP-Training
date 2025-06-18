import java.util.*;

public class volume_earth {
    public static void main(String[] args) {
        double km = 6378 ;
        double miles = km * 1.6;

        double pi = 3.14;

        double vol_km = (4/3)*pi*Math.pow(km,3);
        double vol_miles = (4/3)*pi*Math.pow(miles,3);

        System.out.println("The volume of earth in cubic kilometers is " + vol_km + " and cubic miles is " + vol_miles);
    }
}
