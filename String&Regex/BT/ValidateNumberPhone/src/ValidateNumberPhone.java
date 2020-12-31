import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    Scanner sc = new Scanner(System.in);

    public String checkNumberPhone() {
        String numPhone = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d{2}-0\\d{9}");
        Matcher matcher = pattern.matcher(numPhone);
        matcher.matches();
        if (matcher.matches()){
            System.out.println("Hợp lệ");
            return numPhone;
        }else {
            System.out.println("Không hợp lệ");
            return checkNumberPhone();
        }
    }

    public static void main(String[] args) {
        ValidateNumberPhone check = new ValidateNumberPhone();
        check.checkNumberPhone();
    }
}
