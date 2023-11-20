import java.awt.*;

public class Triangle extends Shape {
    private int baseLength;
    private int height;

    public Triangle(Turtle turtle, Point location, Color color, int border, int baseLength, int height) {
        super(turtle, location, color, border);
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public void paint() {
        drawTriangle(baseLength, height);
    }
    private void drawTriangle(int baseLength, int height) {
        setTurtleProperties();
        turtle.turnLeft(90);
        turtle.forward(baseLength);
        turtle.turnRight(135);
        turtle.forward(height);
        turtle.turnRight(135);
        turtle.forward(baseLength);
        turtle.turnLeft(90);
    }
}
