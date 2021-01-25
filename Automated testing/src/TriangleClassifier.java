public class TriangleClassifier {
    public static String checkTriangle(double sideA,double sideB,double sideC){
        return checkTriangleTrue(sideA,sideB,sideC);
    }
    public static String checkTriangleTrue(double sideA, double sideB, double sideC){
        if(sideA == 0 || sideB == 0 || sideC == 0)
            return"đây không phải tam giác";
        if((sideC + sideB) <= sideA || (sideA + sideC) <= sideB || (sideA + sideB ) <= sideC ){
            return"đây không phải tam giác";
        }

        return checkTriangleDeu(sideA,sideB,sideC);
    }

    public static  String checkTriangleDeu(double sideA,double sideB,double sideC){
        if(sideA == sideB && sideA == sideC && sideB == sideC){
            return "đây là tam giác đều";
        }else {
            return checkTriangleCan(sideA,sideB,sideC);
        }
    }
    public static  String checkTriangleCan(double sideA,double sideB,double sideC){
        if(sideA == sideB || sideA == sideC || sideB == sideC){
            return "đây là tam giác cân";
        }else {
            return "tam giác thường";
        }
    }
}
