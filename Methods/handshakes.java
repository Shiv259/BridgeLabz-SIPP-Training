import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(hand(sc.nextInt()));
    }
    public static int hand(int n){
        int comb = n*(n-1)/2;
        return comb;
    }
}
