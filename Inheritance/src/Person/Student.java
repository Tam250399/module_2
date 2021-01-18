package Person;

import java.util.Scanner;

public class Student extends person{
    protected  String masv;
    protected float diemtrungbinh;
    protected String email;

    public void inPutStudent() {
        Scanner student = new Scanner(System.in);
        System.out.println("Nhập mã sv :");
        this.masv = student.nextLine();
        System.out.println("nhập điểm trung bình :");
        this.diemtrungbinh = student.nextFloat();
        System.out.println("nhập email :");
        this.email = student.nextLine();

    }
    public void showStudent(){
        System.out.println("mã sinh viên :" + this.masv + "\n" + "điểm trung bình :"+ this.diemtrungbinh + "\n" + "nhập email :" + this.email);
    }
    public void kiemtrahocbong(){
        if (this.diemtrungbinh >= 8){
            System.out.println("Được học bổng");
        }else {
            System.out.println("Không được học bổng");
        }
    }
}
