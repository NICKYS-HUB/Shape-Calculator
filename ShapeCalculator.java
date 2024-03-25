import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Geometry Calculator Menu:");
            System.out.println("1. Calculate the area of a Circle");
            System.out.println("2. Calculate the area of a Rectangle");
            System.out.println("3. Calculate the area of a Triangle");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    calculateCircleArea(scanner);
                    break;
                case 2:
                    calculateRectangleArea(scanner);
                    break;
                case 3:
                    calculateTriangleArea(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
    }
    
    public static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        if (radius <= 0) {
            System.out.println("Invalid input. Radius must be a positive number.");
        } else {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("The area of the circle is: " + area);
        }
    }
    
    public static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid input. Length and width must be positive numbers.");
        } else {
            double area = length * width;
            System.out.println("The area of the rectangle is: " + area);
        }
    }
    
    public static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        if (base <= 0 || height <= 0) {
            System.out.println("Invalid input. Base and height must be positive numbers.");
        } else {
            double area = 0.5 * base * height;
            System.out.println("The area of the triangle is: " + area);
        }
    }
}




