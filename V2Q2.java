
package viva2;
import java.util.Scanner;
public class V2Q2 {
    
    // Method 1: to calculate area of a circle
    public static double calculateCircleArea(double radius){
        return Math.PI * radius * radius;        
    }
    
    // Method 2: to calculate area of rectangle
    public static double calculateRectangleArea(double length, double width){
        return (length * width);
    }
    
    // Method 3: to calculate area of triangle
    public static double calculateTriangleArea(double base, double height){
        return (base * height)/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Choose the shape to calculate the are: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            // this will exit the program if user chooses 4
            if (choice == 4){
                System.out.println("Exiting the program.");
                break;
            
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    double circleArea = calculateCircleArea(radius);
                    System.out.printf("The area of the circle is: %.2f%n", circleArea);
                    break;
                    
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    double rectangleArea = calculateRectangleArea(length, width);
                    System.out.printf("The area of the rectangle is: %.1f%n", rectangleArea);
                    break;
                    
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = sc.nextDouble();
                    double triangleArea = calculateTriangleArea(base, height);
                    System.out.printf("The area of the triangle is: %.1f%n", triangleArea);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            } 
            System.out.println("");
        }
        sc.close();
            
    }
    
    
}
    
    

