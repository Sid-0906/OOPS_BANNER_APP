public class ASS2{
    public static void main(String[] args) {

        // Distances
        double chennaiToVellore = 156.6;
        double velloreToBangalore = 211.8;

        // Time
        int hours1 = 4;
        int minutes1 = 4;

        int hours2 = 4;
        int minutes2 = 25;

        // Total Distance
        double totalDistance = chennaiToVellore + velloreToBangalore;

        // Total Time Calculation
        int totalMinutes = minutes1 + minutes2;
        int totalHours = hours1 + hours2 + (totalMinutes / 60);
        totalMinutes = totalMinutes % 60;

        // Output
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Time: " + totalHours + " Hours and " + totalMinutes + " Minutes");
    }
}