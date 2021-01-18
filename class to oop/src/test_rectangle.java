public class test_rectangle {
    double width, height;

    public test_rectangle() {
    }

    public test_rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width * this.height)*2;
    }
    public String Display (){
        return "Ractengle("+ "width :"+ width + ", height :"+ height + ")";
    }

}