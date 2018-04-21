package Graphicalobjects;

public class Circle  extends GraphicalObject{
    private String color;
    private Point center;
    private int radius;

    public Circle(String color, Point center, int radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  String.format("%s circle with center %s and radius %d",this.getColor(),this.center,this.radius);
    }
}
