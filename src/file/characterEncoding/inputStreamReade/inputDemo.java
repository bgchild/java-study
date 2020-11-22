package file.characterEncoding.inputStreamReade;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class inputDemo {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/file/gbk.txt");
        InputStreamReader isr = new InputStreamReader(is,"GBK");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char) len);
        }
    }
}
