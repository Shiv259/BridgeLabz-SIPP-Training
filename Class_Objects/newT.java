import java.util.*;
public class newT {
    public static void main(String[] args) {
        String s = "aabbbc";
        HashMap<Character , Integer> hs = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // if(!hs.containsKey(ch)){
            //     hs.put(ch,0);
            // }
            // hs.put(ch,hs.get(ch)+1);
            hs.put(ch , hs.getOrDefault(ch,0)+1); 
        }
        for(char ch: hs.keySet()){
            System.out.println(ch+" "+hs.get(ch));
        }
    }
}
