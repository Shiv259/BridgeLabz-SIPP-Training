public class calculate {
    public static void main(String[] args) {
        int CP = 129;
        int SP = 191;

        int profit = SP- CP;
        int profit_percent = profit/ CP*100;

        System.out.println("The Cost Price is INR " + CP + "and Selling Price is INR " + SP + "\nThe Profit is INR "+ profit + " and the Profit Percentage is " + profit_percent );
    }
}
