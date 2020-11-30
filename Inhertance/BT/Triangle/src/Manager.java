public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void display(){
        System.out.println("bonus: " + bonus);
    }

    @Override
    public String toString() {
        return
                "bonus=" + bonus + super.toString();
    }

    public static void main(String[] args) {
        Manager manager = new Manager("phuoc",1000,100);
        System.out.println(manager);
    }
}
