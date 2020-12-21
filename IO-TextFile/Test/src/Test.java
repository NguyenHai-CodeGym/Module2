import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\Code Gym\\Module2\\IO-TextFile\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i;
        while ((i = bufferedReader.read()) != -1){
            System.out.print((char) i);
        }
        bufferedReader.close();
        fileReader.close();

    }
}
