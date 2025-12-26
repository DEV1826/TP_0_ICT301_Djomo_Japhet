package ict301.solid.ocp;

public class Main {
    public static void main(String[] args) {
        AreaCalculator2 calculator = new AreaCalculator2();
        
        Shape rectangle = new RectangleOCP(4, 3);
        System.out.println("Area Rectangle = " + calculator.calculateArea(rectangle));
        
        Shape circle = new CircleOCP(5);
        System.out.println("Area Circle = " + calculator.calculateArea(circle));
        
    
    }
}
