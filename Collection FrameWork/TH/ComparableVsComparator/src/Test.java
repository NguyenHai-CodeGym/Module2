import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Hai",23,"Hue");
        Student student2 = new Student("Phuoc",19,"Hue");
        Student student3 = new Student("Thang",22,"QBinh");
        Student student4 = new Student("Dat",25,"Hue");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);


        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        for(Student i : list){
            System.out.println(i);
        }

    }
}
