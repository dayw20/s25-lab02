package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private final Shape shape;
    
    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        // assume implementation

        System.out.printf("%s printed%nIts area is %.2f%n", 
            shape.getName(), shape.getArea());
    }
}
