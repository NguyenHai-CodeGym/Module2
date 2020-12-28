import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    static Scanner sc = new Scanner(System.in);

    // check gender
    public static String checkGender(String mess) {
        System.out.println(mess);
        System.out.println("Male or Female");
        String gender = sc.nextLine().replace(" ", "");
        String fomatGender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        if (fomatGender.equals("Male") || fomatGender.equals("Female")) {
            return fomatGender;
        } else {
            return checkGender(mess);
        }
    }



    //    check name
    public String checkName(String mess) {
        System.out.println(mess);
        System.err.println("Tên không được là số hoặc có kí tự đặc biệt");
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Za-z\\s]*");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches() ? name : checkName(mess);
    }


    //    check age
    public int checkAge(String mess) {
        System.out.println(mess);
        try {
            int age = Integer.parseInt(sc.nextLine());
            if (age < 0 || age > 100) {
                System.out.println("Tuổi không hợp lệ");
                return checkAge(mess);
            }
            return age;
        } catch (Exception e) {
            System.out.println("Tuổi phải là số");
            return checkAge(mess);
        }
    }

    //    check scoure
    public double checkScoure(String mess) {
        System.out.println(mess);
        try {
            double scoure = Double.parseDouble(sc.nextLine());
            if (scoure < 0.0 || scoure > 100.0) {
                System.out.println("Điểm không hợp lệ");
                return checkScoure(mess);
            }
            return scoure;
        } catch (Exception e) {
            System.out.println("Điểm phải là số");
            return checkScoure(mess);
        }
    }

    //    checkInteger
    public int inputNumber() {
        System.out.println();
        try {
            int number = Integer.parseInt(sc.nextLine());
            if (number < 0) {
                System.out.println("Không hợp lệ");
                return inputNumber();
            }
            return number;
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập là 1 số");
            return inputNumber();
        }
    }
}
