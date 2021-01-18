package Person;

import java.util.Scanner;

public class person {
    protected String name;
    protected String sex;
    protected String adrress;
    protected String ngaysinh;

    public void inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên :");
        this.name = sc.nextLine();
        System.out.println("nhập giới tính :");
        this.sex = sc.nextLine();
        System.out.println("nhập địa chỉ :");
        this.adrress = sc.nextLine();
        System.out.println("nhập ngày sinh :");
        this.ngaysinh = sc.nextLine();
    }

    public void showPerson() {
        System.out.println("Họ Tên :" + this.name+ "\n" + "giới tính :" + this.sex + "\n" + "Địa chỉ :" + this.adrress + "\n" + "Ngày sinh :" + this.ngaysinh);
    }
}
