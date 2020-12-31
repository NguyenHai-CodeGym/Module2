import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    Scanner sc = new Scanner(System.in);
    public String checkClassName(){
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile("^[ACP]{1}+[0-9]{4}+[GHIKLM]{1}");
        Matcher matcher = pattern.matcher(name);
        matcher.matches();
        if ((matcher.matches()) == true){
            System.out.println("Tên hợp lệ");
            return name;
        }else {
            System.out.println("Tên không hợp lệ mời nhập lại:  ");
            return checkClassName();
        }
    }

}
