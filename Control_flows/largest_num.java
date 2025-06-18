public class largest_num {
    public static void main(String[] args) {
        int num1=4;
        int num2=9;
        int num3=10;

        System.out.print("is the first number largest?");
        if(num1>num2 && num1>num3){
            System.out.println("yes");
        }else System.out.println("no");

        System.out.print("is the second number is largest?");
        if(num2>num1 && num2>num3){
            System.out.println("yes");
        } else System.out.println("no");

        System.out.print("is the third number is largest?");
        if(num3>num1 && num3>num2){
            System.out.println("yes");
        } else System.out.println("no");
    }
}
