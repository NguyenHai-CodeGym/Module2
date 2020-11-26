public class CynlinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3);
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(2.5, "red", 10);
        System.out.println(cylinder1.getVolume());
    }
}
