import java.util.Scanner;

public class multiple_val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        

        double arr[]= new double[10];
        
        double total = 0.0;
        int index = 0;


        while(true){
            double n = sc.nextDouble();
            if(n<=0) break;


            if(index==10) break;

            arr[index] = n;
            index++;

            
        }
           for(int i=0;i<index;i++){
                total+=arr[i];
            }
        System.out.printf("%.2f\n ", total);
    }
}
