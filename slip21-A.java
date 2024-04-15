import java.util.Scanner;
abstract class Shape {
int dimension1;
int dimension2;
Shape(int dimension1, int dimension2) {
this.dimension1 = dimension1;
this.dimension2 = dimension2;
}
abstract void printArea();}
class Rectangle extends Shape {
Rectangle(int length, int width) {
super(length, width);
}
@Override
void printArea() {
int area = dimension1 * dimension2;
System.out.println("Area of Rectangle: " + area);
}
}
class Triangle extends Shape {
Triangle(int base, int height) {
super(base, height);
}
@Override
void printArea() {
double area = 0.5 * dimension1 * dimension2;
System.out.println("Area of Triangle: " + area);
}
}
class Circle extends Shape {
Circle(int radius) {
super(radius, 0); // Only one dimension (radius) is needed for
a circle
}
@Override
void printArea() {
double area = Math.PI * dimension1 * dimension1;
System.out.println("Area of Circle: " + area);
}
}
public class ShapeDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter length of Rectangle: ");
int rectLength = scanner.nextInt();
System.out.print("Enter width of Rectangle: ");int rectWidth = scanner.nextInt();
System.out.print("Enter base of Triangle: ");
int triangleBase = scanner.nextInt();
System.out.print("Enter height of Triangle: ");
int triangleHeight = scanner.nextInt();
System.out.print("Enter radius of Circle: ");
int circleRadius = scanner.nextInt();
Rectangle rectangle = new Rectangle(rectLength, rectWidth);
Triangle triangle = new Triangle(triangleBase,
triangleHeight);
Circle circle = new Circle(circleRadius);
rectangle.printArea();
triangle.printArea();
circle.printArea();
scanner.close();
}
}
