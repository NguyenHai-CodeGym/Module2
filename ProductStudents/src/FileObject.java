import java.io.*;

public class FileObject {

    public static void saveFile(Object ob,String fileName) throws Exception{
        File newFile=new File(fileName);
        FileOutputStream fos=new FileOutputStream(newFile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(ob);
        oos.close();
    }

    public static Object readFile(String fileName) throws Exception{
        File newFile=new File(fileName);
        if (!newFile.exists()) return null;
        FileInputStream fis=new FileInputStream(newFile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object object=ois.readObject();
        ois.close();
        return object;
    }
}
