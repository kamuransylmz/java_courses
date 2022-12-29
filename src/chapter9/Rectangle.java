package chapter9;

public class Rectangle {
    protected int length;
    protected int width;
    protected int sides = 4;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public void print(){
        System.out.println("I am a rectangle!");
    }
}
