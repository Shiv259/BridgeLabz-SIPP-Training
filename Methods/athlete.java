import java.util.Scanner;

public class athlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = 5; // in km
        System.out.println(tri(sc.nextInt(),sc.nextInt(),sc.nextInt())); // in meter
    }
    public static int tri(int a, int b , int c){
        int dis_meter = 5*1000;
        int perimeter = a+b+c;
        return dis_meter/perimeter;
    }
}
