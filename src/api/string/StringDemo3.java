package api.string;

/**
 * @author Ann00
 * @date 2020/8/21
 * 转换功能的方法
 * public char[] toCharArray () ：将此字符串转换为新的字符数组。
 * public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
 * public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s = "齐天大圣";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        String replace = s.replace("齐", "天");
        System.out.println(replace);

    }
}
