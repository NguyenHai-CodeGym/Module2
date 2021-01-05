import java.io.*;

public class Process {

    // DOc file
    public Object readFile(String fileName) throws Exception {
        File file = new File(fileName);
        if (!file.exists()) return null;
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        ois.close();
        return object;
    }

    //    Ghi File
    public void saveFile(Object ob, String name) throws Exception {
        File file = new File(name);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ob);
        oos.close();
    }

}
