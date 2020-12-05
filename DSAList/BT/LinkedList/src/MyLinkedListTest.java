import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(0);
        linkedList.addLast(1);
        linkedList.addLast("hai");
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        System.out.println(linkedList.get(2));

        System.out.println(linkedList.getLast());


    }
}
