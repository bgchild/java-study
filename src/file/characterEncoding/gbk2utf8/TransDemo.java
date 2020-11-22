package file.characterEncoding.gbk2utf8;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/21
 * 编码转换
 */
public class TransDemo {
    public static void main(String[] args) throws IOException {
        String si = "src/file/gbk.txt";
        String so = "src/file/gbk2utf8.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(si), "GBk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(so), "UTF8");
        int len;
        char[] cbuf = new char[1024];
        while ((len = isr.read(cbuf)) != -1) {
            osw.write(cbuf,0,len);
        }
        osw.close();
        isr.close();
    }
}
