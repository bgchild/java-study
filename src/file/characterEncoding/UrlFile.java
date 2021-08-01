package file.characterEncoding;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class UrlFile {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        final InputStream is = url.openStream();
        final InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        final BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        is.close();

    }
}
