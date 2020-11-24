import java.util.Arrays;
import java.util.Scanner;

public class CountTheNumStudent {
    public static void main(String[] args) {
//        Check điều kiện kích thướt mảng
        int size;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter size array: ");
            size = sc.nextInt();
            if(size > 30){
                System.out.println("Size should not exceed 30");
            }
        }while (size>30);
//          tao phan tu cho mang
        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            System.out.println("Enter a mark for student" + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
////        show list array:
//        System.out.println(Arrays.toString(arr));
//        đếm số lượng sv đủ điều kiện
        int count = 0;
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i] >=5 && arr[i] <=10){
                count++;
            }
        }
        System.out.println("Số lượng sinh viên đạt chuẩn:" + " " +count);
    }
}
