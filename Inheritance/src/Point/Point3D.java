package Point;

public class Point3D extends Point2D {
    float z = 0.0f;
    public Point3D (){
    }
    public Point3D(float z,float x,float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z ,float x, float y){
        this.x = x;
        this.y = y;
         this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {x,y,z};
    }
    public String toString(){
        return (x + " " + y + " " + " " + z);
    }

}
