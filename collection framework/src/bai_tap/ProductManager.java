package bai_tap;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    static List<Product> products = new ArrayList<>();

   public  void addProducts(Product product){
    products.add(product);
   }

   public void update(Product product){
       for (Product p: products) {
           if(product.getId() == p.getId()){
               p.setName(product.getName());
               p.setPrice(product.getPrice());
           }
       }
   }
   public  void delete(int id){
       for (int i = 0; i< products.size();i++){
           if(products.get(i).getId() == id){
               products.remove(products.get(i));
           }
}
   }
   public void Show(){
       for (Product s : products) {
           System.out.println(s.toString());
       }
   }
   public void Seach(String name){
       for (Product s: products) {
           if(s.getName().equals(name)){
               System.out.println(s.toString());
           }
       }
   }
   public void SortProduct(Product product){

   }


}
