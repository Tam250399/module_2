package Circle;

public class Cylinder extends Circle{
    private double width;
    private double height;

    public  Cylinder (){};
    public Cylinder(double width,double height){
        this.height = height;
        this.width = width;
    }
    public Cylinder (double width, double height,String color,double radius){
        super(radius, color);
        this.width = width;
        this.height = height;
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

}
