import java.sql.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static final String VIETNAMESE_REGEX = "a-zA-ZàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbđĐèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆìÌỉỈĩĨíÍịỊòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰỳỲỷỶỹỸýÝỵỴ";
    private static final Pattern pattern = Pattern.compile("^[\\pL\\pZ]{2,20}$");
     Scanner sc = new Scanner(System.in);

    //    check Number
    public int checkNumber(String mess) {
        System.out.println(mess);
        try {
            int number = Integer.parseInt(sc.nextLine().trim());
            if (number < 0) {
                System.out.println("Không hợp lệ \n Mời nhập lại");
                return checkNumber(mess);
            } else {
                return number;
            }
        } catch (Exception e) {
            System.out.println("Không hợp lệ: ");
            return checkNumber(mess);
        }
    }

    //    check Name
    public String checkName(String mess) {
        System.out.println(mess);
        String name = sc.nextLine().trim();
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return name.toUpperCase().replaceAll("\\s+", " ");
        } else {
            System.out.println("Tên không hợp lệ vui lòng nhập lại:  ");
            return checkName(mess);
        }
    }
    //    check gender
    public String checkGender(String mess) {
        System.out.println(mess);
        System.out.println("Male or Felame");
        try {
            String gender = sc.nextLine().replaceAll(" ", "");
            String Fomat = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
            if (Fomat.equals("Male") || Fomat.equals("Female")) {
                return Fomat;
            } else {
                return checkGender(mess);
            }
        } catch (Exception e) {
            return checkGender("Nhập lại: ");
        }
    }

    //    check Score
    public double checkSoure(String mess) {
        System.out.println(mess);
        try {
            double soure = Double.parseDouble(sc.nextLine());
            if (soure < 0 || soure > 10) {
                System.out.println("Điểm không hợp lệ");
                System.out.println("Vui lòng nhập lại");
                return checkSoure(mess);
            } else {
                return soure;
            }
        } catch (Exception e) {
            return checkSoure("Nhập lại");
        }
    }

//    check birth day
    public String checkDate(String mess){
        try{
            System.out.println(mess);
            System.out.println("YYYY-MM-DD");
            Date date=Date.valueOf(sc.nextLine());
            long time=System.currentTimeMillis();
            Date dateCurrent=new Date(time);
            if(date.toString().compareTo(dateCurrent.toString())>=0){
                return checkDate(mess);
            }
            return date.toString();
        }catch (Exception e){
            System.out.println("YYYY-MM-DD");
            return checkDate(mess);
        }
    }
}
