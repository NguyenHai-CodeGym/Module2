import java.util.Scanner;

public class ChoiceHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông");
        System.out.println("3. In Tam giác cân");
        System.out.println("4. Exit");
        choice  = input.nextInt();

        if (choice == 1){
            for (int i=1; i<=3; i++ ){
                System.out.println("");
                for (int j=1; j<=7;j++){
                    System.out.print("*");
                }
            }
        } else if(choice == 2){
           for(int i = 1;i<=5;i++){
               System.out.println("");
               for(int j=1;j<=i;j++){
                   System.out.print("*");
               }
            }
        } else if (choice == 3){
            for(int i=1; i>=4;i++){
                System.out.println(" ");
                for(int j=7;j<=i;j--){
                    System.out.print("*");
                    j--;
                }
            }
        }

    }
}
