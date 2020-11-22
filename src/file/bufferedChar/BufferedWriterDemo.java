package file.bufferedChar;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/20
 * BufferedWriter： public void newLine() : 写一行行分隔符,由系统属性定义符号。
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("做了一个只会歌唱的傻瓜");
        bw.newLine();
        bw.write("做了一个只会歌唱的傻瓜");
        bw.close();
    }
}
