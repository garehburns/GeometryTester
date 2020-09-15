package geometrytester;

public class Triangle {
    private double base;
    private double height;
    private double area;
    
    public Triangle(double h, double b) {
        height = h;
        base = b;
    }
    
    public double getArea() {
        area = (base * height) / 2;
        return area;
    }
    
    public String toString() {
        String makestring = "/ " + area + " \\";
        return makestring;
    }
}