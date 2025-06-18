public class TravelComputational {
    public static void main(String[] args) {
        String name = "Eric";

        String fromcity="Chennai" , viacity = "vellore" , tocity = "Bangalore";

        double distance_CtoV = 156.6;

        int time_CtoV = 4 * 60 + 4;

        double distance_VtoB = 211.8;

        int time_VtoB = 4 * 60 + 25;

        double totalDistance = distance_CtoV + distance_VtoB;
        int totalTime = time_CtoV + time_VtoB;
        
         System.out.println("The Total Distance travelled by " + name + " from " + fromcity + " to " + tocity + 
         " via " + viacity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");


    }
}
