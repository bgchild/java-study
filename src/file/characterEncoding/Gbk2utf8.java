package file.characterEncoding;

import java.io.*;

/**
 * 编码转换
 * @author laok
 */
public class Gbk2utf8 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/file/gbk.txt");
        //编码引出的问题
        FileReader fileReader = new FileReader(f);
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char)read);
        }
        fileReader.close();

        //编码转换
        FileInputStream fi = new FileInputStream(f);
        FileOutputStream fo = new FileOutputStream("src/file/gbk2utf8.txt");
        InputStreamReader isr = new InputStreamReader(fi, "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(fo, "UTF-8");
        int b;
        while ((b = isr.read()) != -1) {
            osw.write(b);
        }
        isr.close();
        osw.close();
    }
}
