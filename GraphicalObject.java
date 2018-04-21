package Graphicalobjects;

public abstract class GraphicalObject {
    private String color;

    public GraphicalObject(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract void draw();
}
