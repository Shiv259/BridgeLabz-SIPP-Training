import java.util.Scanner;

public class quotient_rem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        find(n, m);

    }
    public static void find(int n , int m){
        int quo= n/m;
        int rem = n%m;

        System.out.println("quotient is: " + quo);
        System.out.println("remainder is: "+rem);
    }
}
