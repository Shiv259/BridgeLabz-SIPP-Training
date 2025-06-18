import java.util.*;

public class count_down {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int counter = sc.nextInt();

        while(counter>=1){
            counter--;
            System.out.println(counter);
        }
    }
}
