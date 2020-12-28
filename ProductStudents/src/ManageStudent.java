import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManageStudent {
    static Students student;
    static ArrayList<Students> studentsList = new ArrayList<>();
    static CheckValidate checkValidate = new CheckValidate();
    static int id = 1;


    //    menu
    public void initMenu() throws Exception {
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.Xem danh sách học viên");
            System.out.println("2.Thêm mới học viên");
            System.out.println("3.Sửa thông tin học viên");
            System.out.println("4.Xóa học viên");
            System.out.println("5.Nhập điêm học viên");
            System.out.println("6.Sửa điểm học viên");
            System.out.println("7.Xếp Loại học viên (từ cao đến thấp)");
            System.out.println("0.Exit");
            choice = checkValidate.inputNumber();

            switch (choice) {
                case 1:
                    showlist();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    addScoure();
                    break;
                case 6:
                    editSoure();
                    break;
                case 7:
                    sortStudent();
                    break;
                case 0:
                    System.out.println("------GOOD BYE-----");
                    System.exit(0);
            }
        }
    }

    //    Load FIle
    static {
        try {
            Object fin = FileObject.readFile("ListStuden.data");
            if (fin == null) {
                studentsList = new ArrayList<>();
            } else {
                studentsList = (ArrayList<Students>) fin;
                id = studentsList.size() + 1;
            }
        } catch (Exception e) {
            studentsList = new ArrayList<>();
        }
    }

    //    SAVE FILE
    public static void saveObjectToFile() {
        try {
            FileObject.saveFile(studentsList, "ListStuden.data");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //    show list
    public static void showlist() {
        System.out.format("%-5s | ", "ID");
        System.out.format("%-60s | ", "Name");
        System.out.format("%-5s | ", "AGE");
        System.out.format("%-10s | ", "GENDER");
        System.out.format("%-10s | ", "SCOURE1");
        System.out.format("%-10s | ", "SCOURE2");
        System.out.format("%-10s | ", "SCOURE3");
        System.out.format("%-10s | ", "SCOURE4");
        System.out.format("%-20s | ", "MEDIUM SCOURE");
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Students student : studentsList) {
            System.out.format("%-5d | ", student.getId());
            System.out.format("%-60s | ", student.getName());
            System.out.format("%-5d | ", student.getAge());
            System.out.format("%-10s | ", student.getGender());
            System.out.format("%-10.1f | ", student.getScore1());
            System.out.format("%-10.1f | ", student.getScore2());
            System.out.format("%-10.1f | ", student.getScore3());
            System.out.format("%-10.1f | ", student.getScore4());
            System.out.format("%-20.1f | ", student.getMediumScoure());
            System.out.println("\n");
        }
    }


    //    ADD Student
    public void addStudent() throws Exception {
        System.out.println("-----THÊM MỚI HỌC VIÊN-----");
        String name = checkValidate.checkName("Nhập tên học viên: ");
        int age = checkValidate.checkAge("Nhập tuổi: ");
        String gender = checkValidate.checkGender("Nhập giới tính: ");
        student = new Students(id++, name, age, gender);
        studentsList.add(student);
        saveObjectToFile();
        System.out.println("------Done-----");
    }


    //    EDIT INFOMATION
    public void editStudent() throws Exception {
        System.out.println("Nhập ID học viên muốn sửa");
        int id = checkValidate.inputNumber();
        for (Students s : studentsList) {
            try {
                if (s.getId() == id) {
                    System.out.println("-----Sửa Thông Tin-----");
                    String name = checkValidate.checkName("Nhập tên học viên: ");
                    s.setName(name);
                    int age = checkValidate.checkAge("Nhập tuổi: ");
                    s.setAge(age);
                    String gender = checkValidate.checkGender("Nhập giới tính: ");
                    s.setGender(gender);
                    saveObjectToFile();
                    System.out.println("-----Done-----");
                    initMenu();
                }
            } catch (Exception e) {
                System.out.println("ID không tồn tại");
                initMenu();
            }
        }
    }


    //    REMOVE STUDENT
    public void removeStudent() {
        System.out.println("-----XÓA THÔNG TIN-----");
        System.out.println("Nhập ID học viên muốn xóa: ");
        int curenntId = checkValidate.inputNumber();
        try {
            studentsList.remove(curenntId - 1);
            saveObjectToFile();
            id--;
        } catch (Exception e) {
            System.out.println("ID không tồn tại");
        }
    }


    //    ADD SCOURE STUDENT
    public void addScoure() throws Exception {
        System.out.println("-------NHẬP ĐIỂM-----");
        System.out.println("Nhập ID muốn nhập điểm: ");
        int id = checkValidate.inputNumber();
        for (Students s : studentsList) {
            if (s.getId() == id) {
                int choice = -1;
                while (choice != 0) {
                    System.out.println("1.Nhập điểm lần 1");
                    System.out.println("2.Nhập điểm lần 2");
                    System.out.println("3.Nhập điểm lần 3");
                    System.out.println("4.Nhập điểm lần 4");
                    System.out.println("5.Trở về Menu chính");
                    System.out.println("0.Thoát chương trình");
                    choice = checkValidate.inputNumber();

                    switch (choice) {
                        case 1:
                            if (s.check1 == true) {
                                double score1 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore1(score1);
                                s.setCheck1(false);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm đã được thiết lập");
                                initMenu();
                            }

                        case 2:
                            if (s.check2 == true) {
                                double score2 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore2(score2);
                                s.setCheck2(false);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm đã được thiết lập");
                                initMenu();
                            }
                        case 3:
                            if (s.check3 == true) {
                                double score3 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore3(score3);
                                s.setCheck3(false);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm đã được thiết lập");
                                initMenu();
                            }
                        case 4:
                            if (s.check4 == true) {
                                double score4 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore4(score4);
                                s.setCheck4(false);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm đã được thiết lập");
                                initMenu();
                            }
                        case 5:
                            initMenu();
                            break;
                        case 0:
                            System.out.println("------GOOD BYE-----");
                            System.exit(0);
                    }
                }
            }
        }
        System.out.println("ID ko tồn tại");
    }

//    eDIT diem

    public void editSoure() throws Exception {
        System.out.println("-------SỬA ĐIỂM-----");
        System.out.println("Nhập ID muốn sửa điểm: ");
        int id = checkValidate.inputNumber();
        for (Students s : studentsList) {
            if (s.getId() == id) {
                int choice = -1;
                while (choice != 0) {
                    System.out.println("1.Nhập điểm lần 1");
                    System.out.println("2.Nhập điểm lần 2");
                    System.out.println("3.Nhập điểm lần 3");
                    System.out.println("4.Nhập điểm lần 4");
                    System.out.println("5.Trở về Menu chính");
                    System.out.println("0.Thoát chương trình");
                    choice = checkValidate.inputNumber();

                    switch (choice) {
                        case 1:
                            if (s.check1 == false) {
                                double score1 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore1(score1);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm chưa được thiết lập không thể sửa");
                                initMenu();
                            }

                        case 2:
                            if (s.check2 == false) {
                                double score2 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore2(score2);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm chưa được thiết lập không thể sửa");
                                initMenu();
                            }
                        case 3:
                            if (s.check3 == false) {
                                double score3 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore3(score3);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm chưa được thiết lập không thể sửa");
                                initMenu();
                            }
                        case 4:
                            if (s.check4 == false) {
                                double score4 = checkValidate.checkScoure("Mời nhập điểm: ");
                                s.setScore4(score4);
                                s.setMediumScoure();
                                saveObjectToFile();
                                System.out.println("-----Done-----");
                                break;
                            } else {
                                System.out.println("Điểm chưa được thiết lập không thể sửa");
                                initMenu();
                            }
                        case 5:
                            initMenu();
                            break;
                        case 0:
                            System.out.println("------GOOD BYE-----");
                            System.exit(0);
                    }
                }
            }
        }
        System.out.println("ID ko tồn tại");
    }

//    XEP LOAI
    public void sortStudent(){
        Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getMediumScoure() < o2.getMediumScoure() ? 1 : -1;
            }
        });

    }
}

