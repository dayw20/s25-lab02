package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        if(height <= 0) throw new IllegalArgumentException("Invalid Height: height must be positive");
        if(width <= 0) throw new IllegalArgumentException("Invalid Width: width must be positive");
        this.height = height;
        this.width = width;
    }


    //setter and getter
    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        this.width = w;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
