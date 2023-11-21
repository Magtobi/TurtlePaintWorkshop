import java.awt.*;
import java.util.Scanner;

public class MainApp {

    private static Scanner scanner = new Scanner(System.in);
    private static World world = new World();
    private static Turtle turtle = new Turtle(world);


    public static void main(String[] args) {
        Turtle turtle = new Turtle(world, 0, 0);
        boolean running = true;


        while (running) {
            displayHomeScreen();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewShape();
                    break;
                case 2:
                    saveImage();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void displayHomeScreen() {
        System.out.println("Home Screen");
        System.out.println("1. Add Shape");
        System.out.println("2. Save Image");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addNewShape() {
        System.out.println("Add New Shape");
        System.out.println("Which shape (1. Square, 2. Circle, 3. Triangle)?");
        int shapeChoice = scanner.nextInt();
        scanner.nextLine();

        switch (shapeChoice) {
            case 1:
                addSquare();
                break;
            case 2:
                addCircle();
                break;
            case 3:
                addTriangle();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void addSquare() {
        System.out.println("Enter side length: ");
        int sideLength = scanner.nextInt();
        System.out.println("Enter border width: ");
        int borderWidth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter border color (RED, BLUE, GREEN, CYAN, MAGENTA): ");
        Color borderColor = getColorFromInput(scanner.nextLine());
        System.out.println("Enter location(x, y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();

        Square square = new Square(turtle, new Point(x, y), borderColor, borderWidth, sideLength);
        square.paint();
    }

    private static void addCircle() {
        System.out.println("Enter radius: ");
        int radius = scanner.nextInt();
        System.out.println("Enter border width: ");
        int borderWidth = scanner.nextInt();
        System.out.println("Enter border color (RED, BLUE, GREEN, CYAN, MAGENTA): ");
        Color borderColor = getColorFromInput(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter location (x, y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();

        Circle circle = new Circle(turtle, new Point(x, y), borderColor, borderWidth, radius);
        circle.paint();
    }

    private static void addTriangle() {
        System.out.print("Enter base length: ");
        int baseLength = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter border width: ");
        int borderWidth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter border color (RED, BLUE, GREEN, CYAN, MAGENTA): ");
        Color borderColor = getColorFromInput(scanner.nextLine());
        System.out.print("Enter location (x, y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();

        Triangle triangle = new Triangle(turtle, new Point(x, y), borderColor, borderWidth, baseLength, height);
        triangle.paint();
    }

    private static Color getColorFromInput(String color) {
        switch (color.toUpperCase()) {
            case "RED":
                return Color.RED;
            case "BLUE":
                return Color.BLUE;
            case "GREEN":
                return Color.GREEN;
            case "CYAN":
                return Color.CYAN;
            case "MAGENTA":
                return Color.MAGENTA;
            default:
                return Color.BLACK;
        }
    }

    private static void saveImage() {
        // Logic to save the image
        // Example: world.save("canvas.png");
        System.out.println("Image saved.");
    }
}
