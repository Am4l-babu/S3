import java.util.Scanner;

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape (Rectangle, Triangle, Hexagon): ");
        String shapeInput = scanner.nextLine();

        Shape shape;

        switch (shapeInput.toLowerCase()) {
            case "rectangle":
                shape = new Rectangle();
                break;
            case "triangle":
                shape = new Triangle();
                break;
            case "hexagon":
                shape = new Hexagon();
                break;
            default:
                System.out.println("Invalid shape!");
                scanner.close();
                return;
        }

        shape.numberOfSides();

        scanner.close();
    }
}
