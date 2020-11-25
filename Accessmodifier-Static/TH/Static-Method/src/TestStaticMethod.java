public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"Hoang");
        Student s2 = new Student(2,"Khanh");
        Student s3 = new Student(3,"Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
