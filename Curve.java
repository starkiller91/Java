package Graphicalobjects;

public class Curve extends GraphicalObject {
    private int weight;

    public Curve(String color, int weight) {
        super(color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s curve with weight %d", getColor(),getWeight()
        );
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
