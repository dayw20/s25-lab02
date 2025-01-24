package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private final double height;
    private final double width;
    
    public Rectangle(double height, double width){
        if(height <= 0) throw new IllegalArgumentException("Invalid Height: height must be positive");
        if(width <= 0) throw new IllegalArgumentException("Invalid Width: width must be positive");
        this.height = height;
        this.width = width;
    }


    //getter
    public double getHeight(){
        return height;
    }


    public double getWidth(){
        return width;
    }


    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
