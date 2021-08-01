package file.fileBase.demo;

import java.io.*;
import java.util.LinkedHashMap;

/**
 * 文本排序
 * 1. 逐行读取文本信息。
 * 2. 解析文本信息到集合中。
 * 3. 遍历集合，按顺序，写出文本信息。
 * @author laok
 */
public class FileTextSort {
    public static void main(String[] args) throws IOException {
        final File file = new File("src/file/in.txt");
        final BufferedReader br = new BufferedReader(new FileReader(file));
        final LinkedHashMap<String, String> lines = new LinkedHashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            final String[] split = line.split("\\.");
            lines.put(split[0], split[1]);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/out.txt"));
        for (int i = 1; i <= lines.size(); i++) {
            bw.write(i + lines.get(String.valueOf(i)));
            bw.write("\r\n");
        }
        br.close();
        bw.close();
    }
}
