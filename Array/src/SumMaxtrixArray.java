import java.util.Arrays;
import java.util.Scanner;

public class SumMaxtrixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size n");
        int n = sc.nextInt();
        System.out.println("Enter size m");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.println("Index " + i + "-" + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
//        duyet mảng 2 chiều bằng vòng lặp và tostring
        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        System.out.println("Enter the column you want to sum: ");
        int row = sc.nextInt();
        for(int i=0; i< n;i++){
           sum += arr[i][row];
        }
        System.out.println(sum);
    }
}
