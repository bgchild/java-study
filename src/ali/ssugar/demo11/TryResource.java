package ali.ssugar.demo11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author laok
 * @date 2021/8/1
 */
public class TryResource {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("ym.xml"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // handle exception
        }
    }
}
