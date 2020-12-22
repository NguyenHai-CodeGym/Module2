import java.io.*;

public class ProcessFile {
    public static void saveFile(Object ob, String file) throws IOException {
        File newFile = new File(file);

        FileOutputStream outputStream = new FileOutputStream(newFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(ob);
        objectOutputStream.close();
    }

    public static Object readFile(String file) throws Exception {
        File newFile = new File(file);
        if (!newFile.exists()) return null;
        FileInputStream fis = new FileInputStream(newFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object input = ois.readObject();
        ois.close();
        return input;
    }

}
