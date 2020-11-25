public class TestStaticProperty {
    public static void main(String[] args) {
        Car c1 = new Car("Honda CRV","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car c2 = new Car("Honda CRV","Skyactiv 3");
        System.out.println(Car.numberOfCars);

        c1.display();
        c2.display();
    }
}
