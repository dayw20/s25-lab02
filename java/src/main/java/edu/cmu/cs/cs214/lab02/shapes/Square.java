package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        if(sideLen <= 0) throw new IllegalArgumentException("Invalid Sidelen: sidelen must be positive");
        this.sideLen = sideLen;
    }
    
    //setter and getter
    public double getSidelen(){
        return sideLen;
    }

    public void setSidelen(double sl){
        this.sideLen = sl;
    }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
