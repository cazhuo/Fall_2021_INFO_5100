package assignment2;
// Q1) Create a Shape class and two sub classes Rectangle and Square

public class Shape {
    private String name;
    private String color;
    private int area;
    private int perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Shape() {
    }

    public String printShape() {
        return "The shape has a " + this.getColor() + " color";
    }



    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }



}
