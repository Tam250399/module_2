package Shape;

import java.util.Scanner;

public class Triangle {
    double x = 1.0;
    double y = 1.0;
    double z = 1.0;
    public Triangle(){};
    public Triangle (double x , double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public  double getArea(){
        double p = x+y+z/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
    public double getPerimeter(){
        return x+y+z;
    }
    public String toSring(){
        return ("diện tích tam giác là :" + getArea() + "chu vi của tam giác là :"+ getPerimeter());
    }


    public void main(String[] args) {



    }
}


