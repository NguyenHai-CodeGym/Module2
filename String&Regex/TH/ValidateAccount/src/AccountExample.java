import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String account = sc.nextLine();

        Pattern pattern = Pattern.compile("^[_a-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(account);
        System.out.println(matcher.matches());
    }
}
