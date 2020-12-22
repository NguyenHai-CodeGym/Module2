
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CoppyFileBigSize {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên File: ");
        String sourcepath = sc.nextLine();
        System.out.println("Nhập file đầu ra: ");
        String destpath = sc.nextLine();

        File source =  new File(sourcepath);
        File dest = new File(destpath);
        try {
            copyFileUsingJava7Files(source,dest);
            System.out.println("Finish");
        }catch (Exception e){
            System.out.println("Can't coppy that file");
            System.out.println(e.getMessage());
        }
    }
//    phuong thuc doc ghi file
//    private static void copyFileUsingStream(File source, File dest) throws IOException {
//      InputStream inputStream = null;
//      OutputStream outputStream = null;
//
//      try {
//          inputStream = new FileInputStream(source);
//          outputStream = new FileOutputStream(dest);
//          byte[] buffer = new byte[1024];
//          int lenght;
//          while ((lenght = inputStream.read(buffer)) > 0){
//              outputStream.write(buffer,0,lenght);
//          }
//      } finally {
//          inputStream.close();
//          outputStream.close();
//      }
//    }
//    phuong thuc co san
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException{
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }


}

