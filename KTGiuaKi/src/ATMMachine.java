import java.util.Scanner;

public class ATMMachine {
    BankAccount bankAccount = new BankAccount("Nguyễn Văn A", 1200000);
    Scanner sc = new Scanner(System.in);
    String choice = "P";
    private int amount;

    //    menu
    public void intMenu() {
        while (!choice.equals("X")) {
            System.out.println("Menu");
            System.out.println("-----------------");
            System.out.println("1. Nhập phím A để kiểm tra tài khoản");
            System.out.println("2. Nhập phím D để nạp tiền");
            System.out.println("3. Nhập phím W để rút tiền");
            System.out.println("4. Nhập phím H để xem lịch sử (3 lần gần nhất)");
            System.out.println("5. Nhập phím X để ngừng giao dịch");
            System.out.println("Nhap lựa chọn");
            choice = sc.nextLine().toUpperCase();

            switch (choice) {
                case "A":
                    showInfomation();
                    break;
                case "D":
                    recharge();
                    break;
                case "W":
                    withdrawlMoney();
                    break;
                case "H":
                    checkHistory();
                    break;
                case "X":
                    System.out.println("Cám ơn đã sử dụng dịch vụ");
                    System.out.println("------Good Bye------");
            }
        }
    }

    //    show Infomation
    public void showInfomation() {
        System.out.println("Số dư hiện tại " + bankAccount.checkInfomation() + " VNĐ");
    }

    //    nạp tiền
    public void recharge() {
        System.out.println("Giao dich Nạp tiền");
        System.out.println("Vui long nhap: ");
        int amount = sc.nextInt();
        sc.nextLine();
        while (amount <= 0) {
            checkAmount(amount);
            amount = sc.nextInt();
            sc.nextLine();
        }
        bankAccount.addMoney(amount);
        System.out.println("Giao dịch thành công: Bạn vừa nạp " + amount + " VNĐ vào tài khoản");
        System.out.println("Số dư hiện tại: " + bankAccount.checkInfomation());

    }

//        rut tien
    public void withdrawlMoney() {
        System.out.println("Giao dịch nạp tiền");
        System.out.println("Nhập số tiền muốn rút: ");
        int amount = sc.nextInt();
        sc.nextLine();
        while (amount <= 0 || amount > bankAccount.checkInfomation()) {
            checkAmount(amount);
            checkWithdrawl(amount);
            amount = sc.nextInt();
            sc.nextLine();
        }
        bankAccount.withdrawl(amount);
        System.out.println("Giao dịch thành công");
        System.out.println("Bạn vừa rút: " + amount +  " VNĐ");
        System.out.println("Số dư hiện tại " + bankAccount.checkInfomation() );
    }

    //    check amout
    public void checkAmount(int amount) {
        if (amount <=0) {
            System.out.println("số tiền không hơp lệ ");

        }
    }

    //    check amount withdrawl
    public void checkWithdrawl(int amount){
        if(amount > bankAccount.checkInfomation())
            System.out.println("số dư không đủ");
    }

//    check history
    public void checkHistory(){
        bankAccount.history();
    }
}

