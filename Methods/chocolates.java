import java.util.Scanner;

public class chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt(); // number of chocos
        int m = sc.nextInt(); //number of children
        
        divide(n,m);
    }
    private static void divide(int n , int m){
        System.out.println("each child gets " + n/m + "cholocates");
        System.out.println("number of remaining chocos are " + n%m);
    }
}
