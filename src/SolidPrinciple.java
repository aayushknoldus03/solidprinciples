import java.util.Scanner;
public class SolidPrinciple {
    public static void main(String[] args) {

         int width, height;

         Rectangle rectObject = new Rectangle();

         Square squObject = new Square();

         Scanner input = new Scanner(System.in);

         System.out.println("Enter the width of rectangle: ");
         width = input.nextInt();

         System.out.println("Enter the Height of rectangle: ");
         height = input.nextInt();

         rectObject.setWidth(width);

         rectObject.setHeight(height);

         int rectangleWidth = rectObject.getWidth();

            int rectangleHeight = rectObject.getHeight();

            System.out.println("width of rectangle: " + rectangleWidth);

            System.out.println("height of rectangle: " + rectangleHeight);
            int rectangleArea = rectObject.getArea();

            System.out.println("area of rectangle: " + rectangleArea);

            System.out.println("Enter the width of square: ");
            width = input.nextInt();

            System.out.println("Enter the Height of square: ");
            height = input.nextInt();

            squObject.setWidth(width);

            squObject.setHeight(height);

            int squareWidth = squObject.getWidth();

            int squareHeight = squObject.getHeight();

            System.out.println("width of square: " + squareWidth);

            System.out.println("height of square: " + squareHeight);

            int squareArea = squObject.getArea();

            System.out.println("area of rectangle: " + squareArea);
    }
}


