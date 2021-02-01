package bai_tap;

//import Comparable_Comparator.Student;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do{
            System.out.println("1 : thêm phần tử");
            System.out.println("2 : sửa phần tử");
            System.out.println("3 : xóa phần tử");
            System.out.println("4 : show phần tử");
            System.out.println("5 : Seach phần tử");
            System.out.println("6 : Sắp xếp phần tử");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:

                    System.out.println("nhập tên :");
                    String name = sc.nextLine();
                    System.out.println("nhập id :");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập giá");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product = new Product(name , id , price);
                    ProductManager.products.add(product);
                    break;
                case 2 :
                    Product product1 = new Product();
                    System.out.println("nhập id cần sửa");
                    product1.setId(Integer.parseInt(sc.nextLine()));
                    System.out.println("nhập tên cần sửa");
                    product1.setName(sc.nextLine());
                    System.out.println("nhập giá cần sửa");
                    product1.setPrice(Integer.parseInt(sc.nextLine()));
                    productManager.update(product1);
                    break;
                case 3:
                    System.out.println("nhập vị trí cần xóa");
                    int deletes = Integer.parseInt(sc.nextLine());
                    productManager.delete(deletes);
                    break;
                case 4:
                    productManager.Show();
                    break;
                case 5:
                    System.out.println("Seach phần tử");
                    String abc = sc.nextLine();
                    productManager.Seach(abc);
                    break;
                case 6:
                    Collections.sort(ProductManager.products);
            }
        }while (true);
    }
}
