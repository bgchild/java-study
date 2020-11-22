package file.bufferedChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * BufferedReader： public String readLine() : 读一行文字。
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file/a.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
        fr.close();
    }
}
