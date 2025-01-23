package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(1.5);
        Shape circle = new Circle(2);

        Renderer rectangleRenderer = new Renderer(rectangle);
        rectangleRenderer.draw();

        Renderer circleRenderer = new Renderer(circle);
        circleRenderer.draw();

        Renderer squareRenderer = new Renderer(square);
        squareRenderer.draw();
    }
}
