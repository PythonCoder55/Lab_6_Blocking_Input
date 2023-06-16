import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank;
        double fuelEfficiency;
        double pricePerGallon;

        do {
            System.out.println("Enter the number of gallons of gas in the tank: ");
            if(in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                if(gallonsInTank <= 0) {
                    System.out.println("You did not enter a positive number!");
                }
            }
            else {
                System.out.println("You did not enter a double!");
                in.nextLine();
                gallonsInTank = -1;
            }
        } while (gallonsInTank <= 0);

        do {
            System.out.println("Enter the fuel efficiency in miles per gallon: ");
            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                if(fuelEfficiency <= 0) {
                    System.out.println("You did not enter a positive number!");
                }
            }
            else {
                System.out.println("You did not enter a double!");
                in.nextLine();
                fuelEfficiency = -1;
            }
        } while (fuelEfficiency <= 0);

        do {
            System.out.println("Enter the price of gas per gallon: ");
            if(in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                if(pricePerGallon <= 0) {
                    System.out.println("You did not enter a positive number!");
                }
            }
            else {
                System.out.println("You did not enter a double!");
                in.nextLine();
                pricePerGallon = -1;
            }
        } while (pricePerGallon <= 0);

        double cost = (100 / fuelEfficiency) * pricePerGallon;
        double distance = gallonsInTank * fuelEfficiency;

        System.out.println("Cost per 100 miles: $" + cost);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");
    }
}
