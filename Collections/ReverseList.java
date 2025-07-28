import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
    
        ll.add(7);
        ll.add(5);
        ll.add(10);
        ll.add(20);
        Collections.reverse(ll);
        System.out.println(ll);
    }
    

}
