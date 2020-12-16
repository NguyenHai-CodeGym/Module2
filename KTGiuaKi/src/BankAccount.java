import java.util.ArrayList;

public class BankAccount {
    private String name;
    private int money;

    ArrayList<String> listHistory = new ArrayList<>();

    public BankAccount(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    add money
    public void addMoney(int amount) {
        money += amount;
        listHistory.add("Nạp tiền " + amount);
    }

    //    Withdrawal
    public void withdrawl(int amount) {
        money -= amount;
        listHistory.add("Rút tiền: " + amount);
    }

    //    imfomation
    public int checkInfomation() {
        return money;
    }


    //    history
    public void history() {
        int count = 0;
        for (int i = listHistory.size() - 1; i > 0; i--) {
            if (count < 3) {
                System.out.println(listHistory.get(i));
            }
            count++;
        }

    }
}
