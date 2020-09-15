package geometrytester;

public class Circle {
    private double radius;
    private double area;
    
    public Circle (double r) {
        radius = r;
    }
    
    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    public String toString() {
        String makestring = "( " + area + " )";
        return makestring;
    }
}