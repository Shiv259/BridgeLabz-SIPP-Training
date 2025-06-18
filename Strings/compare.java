package Strings;

public class compare {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        boolean b= true;

        if(s1.length() != s2.length()) b=false;
        else {

        for(int i=0;i<s1.length();i++){
             if(s1.charAt(i)!=s2.charAt(i)) b=false;
                break;
        }
    }

    System.out.println("are strings equal ?(char by char ) "+ b);

    System.out.println("are strings equal? (using equals) "+b);
        
    }
}
