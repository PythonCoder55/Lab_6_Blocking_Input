import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters;

        do {
            System.out.println("Enter a measurement in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                if(meters < 0) {
                    System.out.println("You did not enter a positive number!");
                }
            }
            else {
                System.out.println("You did not enter a double!");
                in.nextLine();
                meters = -1;
            }
        } while (meters < 0);

        double miles = meters * 0.00062137;
        double feet = meters * 3.2808399;
        double inches = meters * 39.3700787;

        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}
