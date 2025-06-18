import java.util.*;
public class natural_num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        if(n<=0){
            System.out.println("enter positive number greater than 0");
        }
            //computation using while loop
        int i=1;
        int sum_while =0;
        while(n>=i){
            sum_while+=i;
            i++;
        }
        
        //computation using formulae
        int sum_formula =n*(n+1)/2;

        System.out.println("sum using while loop "+ sum_while);
        System.out.println("sum using formulae "+ sum_formula);

        if(sum_formula==sum_while){
            System.out.println("both results match: computaion is correct");
        } else System.out.println("computaion mismatch");
    }
}
