package file.exception;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ann00
 * @date 2020/8/20
 */
public class HandleException {
    public static void main(String[] args) {
        // 声明变量
        FileWriter fw = null;
        try {
            //创建流对象
            fw = new FileWriter("src/file/a.txt");
            // 写出数据
            fw.write("笑傲江湖");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
