import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collectionss {
    public static void main(String[] args) {
        List <Integer> myList = new ArrayList<>();
        // addAll() :thêm một hoặc nhiều phần tử vào tập hợp.
        Collections.addAll(myList, 2,2,5,7,5,3);
        System.out.println(myList.toString());
        // sort(): sắp xếp các phần tử của tập hợp
        Collections.sort(myList);
        System.out.println(myList.toString());
        // binarySeach(): tìm kiếm nhị phân
        System.out.println(Collections.binarySearch(myList,7));
        //reverse(): đảo ngược phần tử trong tập hợp
        Collections.reverse(myList);
        System.out.println(myList.toString());
        //shuffle (): xáo trộn các phần tử trong tập hợp
        Collections.shuffle(myList);
        System.out.println(myList.toString());
        Collections.shuffle(myList);
        System.out.println(myList.toString());
        //replaceAll():thay thế phần tử trong tập hợp bằng 1 phần tử khác
       Collections.replaceAll(myList,5,100);
        System.out.println(myList.toString());

    }
}
