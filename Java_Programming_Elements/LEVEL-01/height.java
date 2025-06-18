import java.util.Scanner;

public class height {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int h = sc.nextInt();

         double inch = (double) 2.54 * h;
         double foot = (double) 12 * inch;

         System.out.println("Your Height in cm is " + h + " while in feet is " + foot + "and inches is" + inch);
    }
}
