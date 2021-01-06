import com.github.cliftonlabs.json_simple.JsonObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManageStudents {
    CheckValidate check = new CheckValidate();
    Students students = new Students();
    static ArrayList<Students> studentList = new ArrayList<>();
    ArrayList<Students> tempStudentList = new ArrayList<>();
    static int id = 1;
    int choice = -1;
    static Gson gson = new Gson();

//    Load FIle
    static {
        try (Reader reader = new FileReader("students.json")) {
            Type classOfT = new TypeToken<ArrayList<Students>>() {
            }.getType();
            studentList = gson.fromJson(reader, classOfT);
            if (studentList == null) {
                studentList = new ArrayList<>();
            } else {
                int maxId = -1;
                for (Students st : studentList) {
                    if (st.getId() > maxId) {
                        maxId = st.getId();
                    }
                }
                id = maxId + 1;
            }
        } catch (IOException e) {
            new ArrayList<Students>();
            id = 1;
        }
    }


    //    menu
    public void initMenu() {
        while (choice != 0) {
            System.out.println("1. Xem danh sách học viên");
            System.out.println("2. Thêm học viên");
            System.out.println("3. Sủa thông tin học viên");
            System.out.println("4. Xóa thông tin học viên");
            System.out.println("5. Nhập điểm học viên (Từng hệ điểm)");
            System.out.println("6. Nhập điểm học viên (Nhập toàn bộ)");
            System.out.println("7. Sửa điểm học viên");
            System.out.println("8. Xếp loại học viên");
            System.out.println("0. Exit");
            int choice = check.checkNumber("Nhập lựa chọn: ");
            switch (choice) {
                case 1 -> showList(studentList);
                case 2 -> addStudent();
                case 3 -> editStudent();
                case 4 -> removeStudent();
                case 5 -> addScore();
                case 6 -> addSeri();
                case 7 -> editScore();
                case 8 -> sortStudent();
                case 0 -> {
                    System.out.println("------GOODBYE-------");
                    System.exit(0);
                }
            }
        }
    }

    // Tìm ID
    public Students checkID(int id, ArrayList<Students> list) {
        for (Students s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    //    Tìm tên trong danh sách
    public void findName(String name) {
        for (Students s : studentList) {
            if (s.getName().contains(name)) {
                tempStudentList.add(s);
            }
        }
    }

    //    hiển thị
    public void showList(ArrayList<Students> list) {
        System.out.format("%-5s | ", "ID");
        System.out.format("%-60s | ", "Name");
        System.out.format("%-10s | ", "BIRTHDAY");
        System.out.format("%-10s | ", "GENDER");
        System.out.format("%-10s | ", "SCOURE1");
        System.out.format("%-10s | ", "SCOURE2");
        System.out.format("%-10s | ", "SCOURE3");
        System.out.format("%-10s | ", "SCOURE4");
        System.out.format("%-20s | ", "MEDIUM SCOURE");
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Students student : list) {
            System.out.format("%-5d | ", student.getId());
            System.out.format("%-60s | ", student.getName());
            System.out.format("%-10s | ", student.getDate());
            System.out.format("%-10s | ", student.getGender());
            System.out.format("%-10s | ", student.getScore1() != -1 ? student.getScore1() : "");
            System.out.format("%-10s | ", student.getScore2() != -1 ? student.getScore2() : "");
            System.out.format("%-10s | ", student.getScore3() != -1 ? student.getScore3() : "");
            System.out.format("%-10s | ", student.getScore4() != -1 ? student.getScore4() : "");
            System.out.format("%-20.2f| ", student.getMediumScore());
            System.out.println("\n");
        }
    }

    //    thêm mới học viên
    public void addStudent() {
        System.out.println("------THÊM HỌC VIÊN MỚI-------");
        String name = check.checkName("Nhập tên: ");
        String date = check.checkDate("Nhập ngày sinh: ");
        String gender = check.checkGender("Nhập giới tính: ");
        students = new Students(id++,name, date, gender);
        studentList.add(students);
        saveToFile();
        System.out.println("------DONE------");
    }

    //    Chỉnh sửa học viên
    public void editStudent() {
        System.out.println("-------SỬA THÔNG TIN HỌC VIÊN------");
        String name = check.checkName("Nhập tên học viên muốn sửa: ");
        findName(name);
        if (tempStudentList.size() == 0) {
            System.out.println("Tên không tồn tại");
        } else {
            showList(tempStudentList);
            int id = check.checkNumber("Nhập ID học viên muốn sửa: ");
            if (checkID(id, tempStudentList) == null) {
                System.out.println("ID không tồn tại...!");
                tempStudentList.clear();
            } else {
                while (choice != 0) {
                    System.out.println("1. Sửa tên");
                    System.out.println("2. Sửa ngày sinh");
                    System.out.println("3. Sửa giới tính");
                    System.out.println("4. Trở về menu chính");
                    System.out.println("0. Thoát khỏi chương trình");
                    int choice = check.checkNumber("Nhập lựa chọn: ");

                    switch (choice) {
                        case 1 -> {
                            String newName = check.checkName("Nhập tên mới: ");
                            checkID(id, studentList).setName(newName);
                            tempStudentList.clear();
                            saveToFile();
                            System.out.println("-----DONE------");
                        }
                        case 2 -> {
                            String newDate = check.checkDate("Nhập ngày sinh mới: ");
                            checkID(id, studentList).setDate(newDate);
                            tempStudentList.clear();
                            saveToFile();
                            System.out.println("-----DONE------");
                        }
                        case 3 -> {
                            String newGender = check.checkGender("Nhập giới tính mới: ");
                            checkID(id, studentList).setGender(newGender);
                            tempStudentList.clear();
                            saveToFile();
                            System.out.println("-----DONE------");
                        }
                        case 4 -> {
                            initMenu();
                            tempStudentList.clear();
                        }
                        case 0 -> {
                            System.out.println("-----GOODBYE-----");
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
    //    remove student
    public void removeStudent() {
        System.out.println("------XÓA HỌC VIÊN-----");
        String name = check.checkName("Nhập tên học viên muốn xóa");
        findName(name);
        if (tempStudentList.size() == 0) {
            System.out.println("Tên không tồn tại trong danh sách");
        } else {
            showList(tempStudentList);
            int id = check.checkNumber("Nhập ID học viên muốn xóa: ");
            if (checkID(id, tempStudentList) == null) {
                System.out.println("ID không tồn tại...!");
                tempStudentList.clear();
            } else {
                System.out.println("Nhấn 1 để xác nhận xóa \n Nhấn số bất kỳ để hủy bỏ");
                int choice = check.checkNumber("Nhập lựa chọn: ");
                if (choice == 1) {
                    studentList.remove(checkID(id, studentList));
                    tempStudentList.clear();
                    saveToFile();
                    System.out.println("------DONE-----");
                }
            }
        }
    }

    //    add Score
    public void addScore() {
        System.out.println("------NHẬP ĐIỂM-----");
        String name = check.checkName("Nhập tên học viên muốn thêm điểm: ");
        findName(name);
        if (tempStudentList.size() == 0) {
            System.out.println("Tên không có trong danh sách");
        } else {
            showList(tempStudentList);
            int id = check.checkNumber("Nhập ID học viên thêm điểm: ");
            if (checkID(id, tempStudentList) == null) {
                System.out.println("ID không tồn tại...!");
                tempStudentList.clear();
            } else {
                while (choice != 0) {
                    System.out.println("1.Nhập điểm lần 1");
                    System.out.println("2.Nhập điểm lần 2");
                    System.out.println("3.Nhập điểm lần 3");
                    System.out.println("4.Nhập điểm lần 4");
                    System.out.println("5.Trở về Menu chính");
                    System.out.println("0.Thoát chương trình");
                    int choice = check.checkNumber("Nhập lựa chọn: ");

                    switch (choice) {
                        case 1:
                            if (checkID(id, studentList).getScore1() == -1) {
                                double score1 = check.checkSoure("Mời nhập điểm lần 1(hệ số 1): ");
                                checkID(id, studentList).setScore1(score1);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-----DONE-----");
                                break;
                            }
                            System.out.println("Điểm đã được thiết lập từ trước...!");
                            initMenu();
                        case 2:
                            if (checkID(id, studentList).getScore2() == -1) {
                                double score2 = check.checkSoure("Mời nhập điểm lần 2(hệ số 1): ");
                                checkID(id, studentList).setScore2(score2);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-----DONE-----");
                                break;
                            }
                            System.out.println("Điểm đã được thiết lập từ trước...!");
                            initMenu();
                        case 3:
                            if (checkID(id, studentList).getScore3() == -1) {
                                double score3 = check.checkSoure("Mời nhập điểm lần 3(hệ số 2): ");
                                checkID(id, studentList).setScore3(score3);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-----DONE-----");
                                break;
                            }
                            System.out.println("Điểm đã được thiết lập từ trước...!");
                            initMenu();
                        case 4:
                            if (checkID(id, studentList).getScore4() == -1) {
                                double score4 = check.checkSoure("Mời nhập điểm lần 4(hệ số 3): ");
                                checkID(id, studentList).setScore4(score4);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-----DONE-----");
                                break;
                            }
                            System.out.println("Điểm đã được thiết lập từ trước...!");
                            initMenu();
                        case 5:
                            initMenu();
                            break;
                        case 0:
                            System.out.println("-----GOODBYE-----");
                            System.exit(0);
                    }
                }
            }
        }
    }

    //    add Seri
    public void addSeri() {
        System.out.println("------NHẬP ĐIỂM------");
        System.out.println("1.Nhập điểm lần 1 (toàn bộ)");
        System.out.println("2.Nhập điểm lần 2 (toàn bộ)");
        System.out.println("3.Nhập điểm lần 3 (toàn bộ)");
        System.out.println("4.Nhập điểm lần 4 (toàn bộ)");
        System.out.println("5.Trở về Menu chính");
        System.out.println("0.Thoát chương trình");
        int choice = check.checkNumber("Nhập lựa chọn: ");

        switch (choice) {
            case 1:
                for (Students s : studentList) {
                    if (s.getScore1() == -1) {
                        double score1 = check.checkSoure("Nhập điểm của sinh viên " + s.getName());
                        s.setScore1(score1);
                        s.setMediumScore();
                        saveToFile();
                    } else {
                        System.out.println("Điểm của sinh viên " + s.getName() + " đã được thiết lập trước");
                    }
                }
                break;
            case 2:
                for (Students s : studentList) {
                    if (s.getScore2() == -1) {
                        double score2 = check.checkSoure("Nhập điểm của sinh viên " + s.getName());
                        s.setScore2(score2);
                        s.setMediumScore();
                        saveToFile();
                    } else {
                        System.out.println("Điểm của sinh viên " + s.getName() + " đã được thiết lập trước");
                    }
                }
                break;
            case 3:
                for (Students s : studentList) {
                    if (s.getScore3() == -1) {
                        double score3 = check.checkSoure("Nhập điểm của sinh viên " + s.getName());
                        s.setScore3(score3);
                        s.setMediumScore();
                        saveToFile();
                    } else {
                        System.out.println("Điểm của sinh viên " + s.getName() + " đã được thiết lập trước");
                    }
                }
                break;

            case 4:
                for (Students s : studentList) {
                    if (s.getScore4() == -1) {
                        double score4 = check.checkSoure("Nhập điểm của sinh viên " + s.getName());
                        s.setScore4(score4);
                        s.setMediumScore();
                        saveToFile();
                    } else {
                        System.out.println("Điểm của sinh viên " + s.getName() + " đã được thiết lập trước");
                    }
                }
                break;
            case 5:
                initMenu();
                break;
            case 0:
                System.out.println("-----GOODBYE-----");
                System.exit(0);
        }
    }

    //    edit score
    public void editScore() {
        System.out.println("-----SỬA ĐIỂM------");
        String name = check.checkName("Nhập tên học viên muốn sửa điểm: ");
        findName(name);
        if (tempStudentList.size() == 0) {
            System.out.println("Tên không tồn tại");
        } else {
            showList(tempStudentList);
            int id = check.checkNumber("Nhập ID học viên thêm điểm: ");
            if (checkID(id, tempStudentList) == null) {
                System.out.println("ID không tồn tại...!");
                tempStudentList.clear();
            } else {
                while (choice != 0) {
                    System.out.println("1. Sửa điểm lần 1");
                    System.out.println("2. Sửa điểm lần 2");
                    System.out.println("3. Sửa điểm lần 3");
                    System.out.println("4. Sửa điểm lần 4");
                    System.out.println("5. Trở về menu chính");
                    System.out.println("0. Thoát chương trình");
                    int choice = check.checkNumber("Mời nhập lựa chọn:");

                    switch (choice) {
                        case 1:
                            if (checkID(id, studentList).getScore1() != -1) {
                                double newScore1 = check.checkSoure("Nhập điểm lần 1 mới: ");
                                checkID(id, studentList).setScore1(newScore1);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-------DONE------");
                                break;
                            } else {
                                System.out.println("Điểm chưa thiết lập không thể sửa");
                                initMenu();
                            }
                        case 2:
                            if (checkID(id, studentList).getScore2() != -1) {
                                double newScore2 = check.checkSoure("Nhập điểm lần 2 mới: ");
                                checkID(id, studentList).setScore2(newScore2);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-------DONE------");
                                break;
                            } else {
                                System.out.println("Điểm chưa thiết lập không thể sửa");
                                initMenu();
                            }
                        case 3:
                            if (checkID(id, studentList).getScore3() != -1) {
                                double newScore3 = check.checkSoure("Nhập điểm lần 3 mới: ");
                                checkID(id, studentList).setScore3(newScore3);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-------DONE------");
                                break;
                            } else {
                                System.out.println("Điểm chưa thiết lập không thể sửa");
                                initMenu();
                            }
                        case 4:
                            if (checkID(id, studentList).getScore4() != -1) {
                                double newScore4 = check.checkSoure("Nhập điểm lần 4 mới: ");
                                checkID(id, studentList).setScore4(newScore4);
                                checkID(id, studentList).setMediumScore();
                                tempStudentList.clear();
                                saveToFile();
                                System.out.println("-------DONE------");
                                break;
                            } else {
                                System.out.println("Điểm chưa thiết lập không thể sửa");
                                initMenu();
                            }
                        case 5:
                            initMenu();
                            break;
                        case 0:
                            System.out.println("-----GOODBYE-----");
                            System.exit(0);
                    }
                }
            }
        }
    }

    //    sap xep
    public void sortStudent() {
        Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getMediumScore() < o2.getMediumScore() ? 1 : -1;
            }
        });
    }
// save file
    public void saveToFile() {
        try (FileWriter fileWriter = new FileWriter("students.json")) {
            gson.toJson(studentList, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}