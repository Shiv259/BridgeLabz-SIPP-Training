import java.util.Scanner;

public class pos_neg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pos(n));
    }
    public static int pos(int n){
        if(n<0) return -1;
        if(n==0) return 0;
        else return 1; 
    }
}