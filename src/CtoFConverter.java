import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF;
        boolean isDouble = false;

        do {
            System.out.println("What is the temperature in Celsius?");
            if(in.hasNextDouble())
            {
                tempC = in.nextDouble();
                isDouble = true;
            }
            else {
                System.out.println("You did not enter a valid double!");
                isDouble = false;
                in.nextLine();
            }
        } while(!isDouble);

        tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}