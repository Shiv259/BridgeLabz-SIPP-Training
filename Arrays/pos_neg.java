import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for(int i =0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            
            System.out.println("\n"+arr[i]);
            if(arr[i]<0) System.out.println("Negative");
            if(arr[i]==0) System.err.println("ZERO");
            
            else{
                System.out.println("POSITIVE");
                if(arr[i]%2==0) System.out.println("EVEN");
                else System.out.println("ODD");
            }

        }
        if(arr[0]==arr[4]){
            System.out.println("Both elements (first & last ) are EQUAL");
        }else if(arr[0]>arr[4]){
            System.out.println("First element is greater than last");
        }else System.out.println("Last element is greater than first");
    }
}
