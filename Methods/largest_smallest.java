import java.util.Scanner;

public class largest_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        find(n1,n2,n3);
    }

    public static void find(int n1, int n2, int n3){
        int largest = Math.max(n1,Math.max(n2,n3));
        System.out.println("largest: " + largest);

        int smallest = Math.min(n2, Math.min(n2,n3));
        System.out.println("smallest: "+ smallest);
    }
}
