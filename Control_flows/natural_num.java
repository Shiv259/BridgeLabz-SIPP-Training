import java.util.*;
public class natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean b = false;

        if(num>=0){
            b= true;
        }
        
        int sum = num*(num+1)/2;

        System.out.print("the sum of "+ num +" natural number is "+sum+ "\notherwise");
        if(b) {
            System.out.println("\nThe number "+ num + " is natural number");
        }else System.out.println("\nThe number is "+ num + " is not natural number");
        

    }
}
