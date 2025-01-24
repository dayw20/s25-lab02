package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private final double sideLen;

    public Square(double sideLen) {
        if(sideLen <= 0) throw new IllegalArgumentException("Invalid Sidelen: sidelen must be positive");
        this.sideLen = sideLen;
    }
    
    //setter and getter
    public double getSidelen(){
        return sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
