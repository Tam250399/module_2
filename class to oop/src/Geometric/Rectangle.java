package Geometric;

public class Rectangle extends Circle{
    private double width;
    private double height;
    public Rectangle (){
    }
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(String color,String filled,double height,double width){
        this.height = height;
        this.width = width;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
}
