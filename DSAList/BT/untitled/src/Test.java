import java.util.ArrayList;

public class Test {

    public static final String Tu = "Tự";

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(Tu);
        list1.add("Sơn");
        list1.add("Đạt");
        list1.add("Thắng");
        list1.add("Babies Thắng");
        list1.add("Huy anh");
        list1.add("Thịnh");

        System.out.println(list1.size());
        System.out.println(list1.get(0));
        System.out.println(list1.set(3, Tu));
        System.out.println(list1);

//        list1.remove(0);

        while(list1.indexOf(Tu)!=-1){
            list1.remove(Tu);
        }
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
    }

}
