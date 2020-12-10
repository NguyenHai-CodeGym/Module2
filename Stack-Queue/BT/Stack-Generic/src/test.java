import java.util.LinkedList;

public class test {
    public static void main(String[] args) {


        MyStackGeneric<NYC> myStackGeneric = new MyStackGeneric<>();
        NYC nyc = new NYC("hai",12);
        NYC nyc2 = new NYC("hai2",13);
        myStackGeneric.push(nyc);
        myStackGeneric.push(nyc2);
        myStackGeneric.print();
        System.out.println(nyc.toString());

    }
}
