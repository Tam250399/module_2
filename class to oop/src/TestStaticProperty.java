public class TestStaticProperty {
    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("Mazda 3","Skyactiv 3");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty car2 = new StaticProperty("Mazda 6", "Audi");
        System.out.println(StaticProperty.numberOfCars);
    }
}
