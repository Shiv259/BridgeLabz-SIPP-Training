import java.util.Scanner;

public class spring_season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        spring(month, day);
    }
    public static void spring(int month, int day){
        if((month==6 && day<21) || (month==3 && day>19) || (month>3 && month<6)) System.out.println("its spring season");
        else  System.out.println("its not a spring season");
    }
}
