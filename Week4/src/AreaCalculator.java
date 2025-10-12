public class AreaCalculator {

    // Method to calculate area of a square
    public static int calculateArea(int side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int squareSide = 5;
        int rectangleLength = 8;
        int rectangleWidth = 4;

        // Calling overloaded methods
        int squareArea = calculateArea(squareSide);
        int rectangleArea = calculateArea(rectangleLength, rectangleWidth);

        // Printing the results
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
