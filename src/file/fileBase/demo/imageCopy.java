package file.fileBase.demo;

import java.io.*;

public class imageCopy {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ide\\idea.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\idea.jpg");
        int len;
        byte[] b = new byte[1024];
        while ((len = fileInputStream.read(b)) != -1) {
            fileOutputStream.write(b, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
