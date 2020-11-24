import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size array: ");
        int n = sc.nextInt();
        System.out.println("Enter col size array: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        for(int i = 0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.println("Inex" + i + " " + "|" + j + ":");
                arr[i][j]= sc.nextInt();
            }
        }
//        show arr
        for(int i=0; i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int index = 0;
        int cheo = 0;
        for(int i=0;i< arr.length;i++){
            for (int j=0; j< arr.length; j++){
                if(arr[i][j] == arr[index][index]){
                    cheo += arr[i][j];
                    index++;
                }
            }
        }
        System.out.println("Tổng của đường chéo chính là: " + " " +cheo);
    }

}
