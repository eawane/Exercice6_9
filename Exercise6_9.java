public class Exercise6_9 {

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet    Meters      |  Meters    Feet");
        System.out.println("---------------------------------------------------");

        double meter = 20.0;

        for (double foot = 1.0; foot <= 10.0; foot++, meter += 5) {
            System.out.printf("%-7.1f %-11.3f|  %-8.1f %-7.3f%n",
                    foot, footToMeter(foot), meter, meterToFoot(meter));
        }
    
