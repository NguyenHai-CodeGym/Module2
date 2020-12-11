import java.util.*;

public class TestHaspMapVsHaspSet {
    public static void main(String[] args) {
        Student student1 = new Student("Hai", 22,"Hue");
        Student student2 = new Student("Phuoc", 19,"Hue");
        Student student3 = new Student("Thang", 22,"QB");

        Map<Integer, Student> hasmap = new HashMap<>();
        hasmap.put(1,student1);
        hasmap.put(2,student2);
        hasmap.put(3,student3);
        hasmap.put(4,student3);
        System.out.println(hasmap);

        Set<Integer> keySet = hasmap.keySet();
        for(Integer keys : keySet){
            System.out.println(keys + " " + hasmap.get(keys));
        }
//        HaspSet
        Set<Student> haspSet = new HashSet<>();
        haspSet.add(student1);
        haspSet.add(student2);
        haspSet.add(student3);
        haspSet.add(student3);

        Iterator<Student> itr = haspSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
