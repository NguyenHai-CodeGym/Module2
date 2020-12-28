public class Test {
    public static void main(String[] args) throws Exception {
        Manage manage = new Manage();
        manage.addStuden();
//        manage.editStudent();
//        manage.ghiFile();
//        manage.deleteStudent();
        Manage.arrayList.stream().forEach(System.out::println);

        System.out.println(Manage.arrayList.size());
    }
}
