package Fan;

public class Fan {
    final float SLOW = 1;
    final float MEDIUM = 2;
    final float FAST = 3;
    private int  speed = (int) SLOW;
    private boolean on = false;
    private  double radius = 5;
    private  String color = "blue";

    public float getSLOW() {
        return SLOW;
    }

    public float getMEDIUM() {
        return MEDIUM;
    }

    public float getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    public String toString() {
        if (isOn()) {
           return (getSpeed() + " " + getColor() + " " + getRadius() + "fan is on");
        }else{
           return (getColor() + " " + getRadius()+ "fan is off");
        }

    }
}
