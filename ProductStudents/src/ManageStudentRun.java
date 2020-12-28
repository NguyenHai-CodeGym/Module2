public class ManageStudentRun {
    public static void main(String[] args) throws Exception {
       ManageStudent manageStudent = new ManageStudent();
       try {
           manageStudent.initMenu();
       }catch (Exception e){
           manageStudent.initMenu();
       }
    }
}
