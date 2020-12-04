import java.util.ArrayList;
import java.util.Scanner;

public class MylistTest {
    public static void main(String[] args) {
        MyList myList = new MyList(10);
        myList.add(0,1);
        myList.add(2);
        myList.clear();
        myList.show();
    }
}
