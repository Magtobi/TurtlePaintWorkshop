import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Turtle turtle, Point location, Color color, int border, int radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        circle(radius);
    }
    public void circle(double radius) {
        setTurtleProperties();
        int numSides = 360;
        double angle = 360.0 / numSides;
        for (int i = 0; i < numSides; i++) {
            turtle.forward(radius * Math.PI * angle);
            turtle.turnLeft(angle);
        }
    }
}
