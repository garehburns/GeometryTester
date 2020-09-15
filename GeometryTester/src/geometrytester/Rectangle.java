package geometrytester;

public class Rectangle {
    private double length;
    private double width;
    private double area;
    
    public Rectangle (double l, double w) {
        length = l;
        width = w;
    }
    
    public double getArea() {
        area = length * width;
        return area;
    }
    
    public String toString() {
        String makestring = "[ " + area + " ]";
        return makestring;
    }
}