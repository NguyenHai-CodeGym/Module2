import java.io.*;

public class SumFileText {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("Input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String c = "";
        int sum = 0;
        try {
            while ((c = bufferedReader.readLine()) != null){
                System.out.println(c);
                sum += Integer.parseInt(c);
            }
            bufferedReader.close();
        } catch (Exception e){
            System.err.println("Lỗi");
        }finally {
            System.out.println("Tổng của file Input là " + sum);
        }
    }
}
