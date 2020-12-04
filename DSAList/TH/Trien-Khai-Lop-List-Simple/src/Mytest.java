public class Mytest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(6);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
x`
        listInteger.add(8);
        System.out.println("element 5: " +listInteger.get(5));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));


    }
}
