import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=  sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(si(p, r, t));

    }
    private static int si(int p,int r, int t){
        int s = (p*r*t)/100;
        return s;
    }
}
