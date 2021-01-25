public class test {
    public static <T> void prinElement(T[] t){
        for (T o: t
             ) {
            System.out.print(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] myArray = {1,5,6,8,9,3,3};
        Double  [] myDouble = {2.1,5.5,3.5,8.9,2.3};
        String [] myString = {"nguyễn" , "Công" , "Tâm"};
        prinElement(myArray);
        prinElement(myDouble);
        prinElement(myString);
    }
}
