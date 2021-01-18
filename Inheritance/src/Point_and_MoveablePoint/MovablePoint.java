package Point_and_MoveablePoint;

public class MovablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    public MovablePoint(){};
    public MovablePoint(float x, float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint (float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public  void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {this.ySpeed,this.xSpeed};
    }
    public String toString(){
        return (x + " " + y + "speed" + xSpeed + " " + ySpeed);
    }
    public float[] move(float xSpeed,float ySpeed,float x,float y){
        float x1 = x+=xSpeed;
        float x2 = y+=ySpeed;
        return new float[] {x1,x2};
    }

}
