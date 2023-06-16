import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width;
        double height;

        do {
            System.out.println("Enter the width of the rectangle(must be positive): ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
            }
            else {
                System.out.println("You did not enter a double!");
                in.nextLine();
                width = -1;
            }
        } while (width <= 0);

        do {
            System.out.println("Enter the height of the rectangle(must be positive): ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
            }
            else {
                System.out.println("You did not enter a double!");
                in.nextLine();
                height = -1;
            }
        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
