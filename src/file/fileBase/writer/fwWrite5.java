package file.fileBase.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 * 续写和换行
 */
public class fwWrite5 {
    public static void main(String[] args) throws IOException {
            FileWriter fw = new FileWriter("src/file/a.txt",true);
            // 写出字符串
            fw.write("天龙八部");
            // 写出换行
            fw.write("\r\n");
            // 写出字符串
            fw.write("笑傲江湖");
            // 关闭资源
            fw.close();
    }
}
