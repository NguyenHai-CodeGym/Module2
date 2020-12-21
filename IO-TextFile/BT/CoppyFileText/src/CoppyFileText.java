import java.io.*;

public class CoppyFileText {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Input.txt");
            BufferedReader br = new BufferedReader(fileReader);
            BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"));

            String value;
            while ((value = br.readLine()) != null) {
                bw.write(value);
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
