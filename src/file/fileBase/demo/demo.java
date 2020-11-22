package file.fileBase.demo;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ann00
 * @date 2020/8/20
 * 文本排序
 * 1. 逐行读取文本信息。
 * 2. 解析文本信息到集合中。
 * 3. 遍历集合，按顺序，写出文本信息。
 */
public class demo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/file/in.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/out.txt"));
        String line ;
        Map<String,String> map = new HashMap<>();
        while ((line = br.readLine()) != null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        br.close();
        for (int i = 1; i <= map.size(); i++) {
            String key = String.valueOf(i);
            bw.write(key+"."+map.get(key));
            bw.newLine();
        }
        bw.close();
    }
}
