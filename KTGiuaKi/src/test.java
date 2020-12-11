import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        User user1 = new User("Nguyễn Văn A", 1200000);
        ArrayList<Integer> Hisrecharge = new ArrayList<>();
        ArrayList<Integer> HisWithdrawal = new ArrayList<>();
        String choice = null;
        Scanner sc = new Scanner(System.in);

        while (choice != "x") {
            System.out.println("Menu");
            System.out.println("1. Nhan phim A de kiem tra tai khoan ");
            System.out.println("2. Nhan phim D de nap tien");
            System.out.println("3. Nhan phim W de rut tien");
            System.out.println("4. Nhan phim H de xem lich su 3 lan");
            System.out.println("0. Nhan phim X de thoat ");
            choice = sc.nextLine();

            int moneyplus = 0;
            int Withdrawal = 0;

            switch (choice) {
                case "A":
                    System.out.println("Tên chủ thẻ" + user1.getName());
                    System.out.println("Số dư tài khoản của quý khách là: " + user1.getMoney());
                    System.out.println("-----------");
                    break;
                case "D":
                    System.out.println("Giao Dịch nạp tiền");
                    System.out.println("Vui lòng nhập số tiền: ");
                    moneyplus = sc.nextInt();
                    String enter  = sc.nextLine();
                    System.out.println("Giao dịch thành công");
                    System.out.println("Bạn vừa nạp: " + " " + moneyplus + " VNĐ vào tài khoản");
                    System.out.println("Số tiền hiện tại");
                    System.out.println(user1.setMoney(user1.getMoney() + moneyplus));
                    Hisrecharge.add(moneyplus);
                    break;
                case "W":
                    System.out.println("Giao dich Rút tiền:");
                    System.out.println("Vui long nhập số tiền muốn rút:");
                    Withdrawal = sc.nextInt();
                    String enter1  = sc.nextLine();
                    if(Withdrawal > user1.getMoney()){
                        System.out.println(" Số dư trong tài khoản không đủ");
                    }else{
                        System.out.println("Bạn vừa rút: " + " " + Withdrawal + " VNĐ thành công" );
                        System.out.println("Số tiền hiện tại");
                        System.out.println(user1.setMoney(user1.getMoney() - Withdrawal));
                        HisWithdrawal.add(Withdrawal);
                    }
                    break;
                case "H":
                    System.out.println("Lịch Sử Giao Dịch");
                    for (int i = 0; i < Hisrecharge.size(); i++) {
                        System.out.println("Nạp tiền: " + Hisrecharge.get(i) + " VNĐ");
                    }
                    for (int i = 0; i < HisWithdrawal.size(); i++) {
                        System.out.println("Rút tiền: " + HisWithdrawal.get(i) + " VNĐ");
                    }
                    break;
                case "X":
                    System.exit(0);
                    break;

            }
        }

    }
}
