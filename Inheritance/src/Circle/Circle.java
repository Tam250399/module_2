package Circle;

public class Circle {
    private double radius;
    private String color;
    public Circle (){};
    public Circle(double radius,String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public  double getDimeter(){
        return 2*(radius*radius);
    }
    public String toString(){
        return ("bán kính :" + this.radius + "màu là :"+ this.color + "diện tich hình tròn :" + getArea() + "chu vi hình tròn " + getDimeter());
    }
}
