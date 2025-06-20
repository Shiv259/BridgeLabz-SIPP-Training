import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print(wind(sc.nextDouble(),sc.nextDouble()));
    }

    public static double wind(double temp , double speed){
        double windchill = 35.74 + 0.6215 * temp +(0.4275 * temp - 35.75) * Math.pow(speed,0.16);
        return windchill;
    }
}
