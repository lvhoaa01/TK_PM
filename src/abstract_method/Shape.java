package abstract_method;

import static java.lang.Math.pow;

abstract class Shape {
    String color;
    public Shape(String color){
        this.color = color;
    }

    public void print(){
        System.out.println("Color is " + this.color);
    }

    abstract double area();
}

class Circle extends Shape{
    public double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14*pow(radius,2);
    }
}


class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }
}