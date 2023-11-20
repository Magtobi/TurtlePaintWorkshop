import java.awt.*;

public class Square extends Shape {
    private int sideLength;
    public Square(Turtle turtle, Point location, Color color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    @Override
    public void paint() {
        setTurtleProperties();
        for (int i = 0; i < 4; i++) {
            turtle.forward(50);
            turtle.turnLeft(90);
        }
    }
    private void paint(int sideLength) {
        setTurtleProperties();
        for (int i = 0; i < 4; i++) {
            turtle.forward(sideLength);
            turtle.turnLeft(90);
        }
    }
}
