import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    static ArrayList<Student> arrayList;
    Scanner sc = new Scanner(System.in);
    static {
        try {
            FileInputStream fn = new FileInputStream("list.txt");
            ObjectInputStream on = new ObjectInputStream(fn);
            if(fn == null){
                arrayList = new ArrayList<>();
            }else {
                arrayList = (ArrayList<Student>) on.readObject();
            }
        }catch (Exception e){
            arrayList = new ArrayList<>();
        }
    }
    public void addStuden(){
        System.out.println("Nhập tên");
        String name = sc.nextLine();

        int age = inputNumber("Nhập tuổi");
        Student student = new Student(name, age);
        arrayList.add(student);
    }

//    ghi file
    public void ghiFile() throws Exception {
        FileOutputStream fo = new FileOutputStream("list.txt");
        ObjectOutputStream ob = new ObjectOutputStream(fo);

        ob.writeObject(arrayList);
        ob.close();
    }

    public Student findStudentByName(String name){
        for (Student student : arrayList){
            if (name.equals(student.getName())){
                return student;
            }
        }
        return null;
    }

    public void editStudent() throws Exception {
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        Student thisStudent = findStudentByName(name);

        if (thisStudent == null){
            System.out.println("khong tim thay");
        }else
        System.out.println("nhap ten moi");
        String newName = sc.nextLine();
        thisStudent.setName(newName);
        ghiFile();
    }

    public void deleteStudent() throws Exception {
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        Student student = findStudentByName(name);

        if (student == null){
            System.out.println("Tên k tìm thấy");
        }else {
            arrayList.remove(student);
        }
        ghiFile();
    }

    public int inputNumber(String messge){
        System.out.println(messge);
        try {
            int number = Integer.parseInt(sc.nextLine());
           if (number < 0 ){
               System.out.println("Nhập số dương");
               return inputNumber(messge);

           }
            return number;
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập là 1 số");
            return inputNumber(messge);
        }
    }
    public int point(String message){
        System.out.println(message);
        try {
            int number = Integer.parseInt(sc.nextLine());
            if (number > 10 || number < 0){
                System.out.println("diểm nhập vào vượt khoảng");
                return point(message);
            }
            return number;
        }catch(NumberFormatException e) {
            System.out.println("Phải nhập là 1 số");
            return point(message);}
    }
}
