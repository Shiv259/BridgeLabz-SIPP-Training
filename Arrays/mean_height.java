import java.util.Scanner;

public class mean_height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] height = new double[11];
        double sum =0.0;
        for(int i=0;i<11;i++){
            height[i]= sc.nextDouble();
            sum+=height[i];
        }
        double mean = sum/11;
        System.out.println("the mean height of players is " + mean);

    }
}
