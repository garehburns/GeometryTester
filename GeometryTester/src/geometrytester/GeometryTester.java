package geometrytester;

public class GeometryTester {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2,3);
        Triangle triangle2 = new Triangle(5,7);
        
        Circle circle1 = new Circle(9);
        Circle circle2 = new Circle(12);
        
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(8,12);
        
        triangle1.getArea();
        triangle2.getArea();
        
        circle1.getArea();
        circle2.getArea();
        
        rectangle1.getArea();
        rectangle2.getArea();
        
        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

    }
    
}
