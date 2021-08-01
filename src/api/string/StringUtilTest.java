package api.string;


/**
 * @author Ann00
 * @date 2020/8/21
 */
public class StringUtilTest {
    public static void main(String[] args) {
        /**
         * 构造方法
         */
        // 无参构造
        String str = new String();
        // 通过字符数组构造
        char chars[] = {'a', 'b', 'c'};
        String str2 = new String(chars);
        // 通过字节数组构造
        byte bytes[] = {97, 98, 99};
        String str3 = new String(bytes);


        /**
         * public int length () ：返回此字符串的长度。
         * public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
         * public char charAt (int index) ：返回指定索引处的 char值。
         * public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
         * public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符
         * 串结尾。
         * public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
         */
        String s = "我是一只小小鸟";
        System.out.println(s.length());
        String sc = s.concat("想要飞确飞不高");
        System.out.println(sc);
        System.out.println(sc.charAt(6));
        System.out.println(sc.indexOf("鸟"));
        System.out.println(sc.substring(0, 7));
        // 创建字符串对象
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        // boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

        /**
         * 转换功能的方法
         * public char[] toCharArray () ：将此字符串转换为新的字符数组。
         * public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。
         * public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使
         */

        String ss = "齐天大圣";
        char[] charss = ss.toCharArray();
        for (char aChar : charss) {
            System.out.println(aChar);
        }
        byte[] bytess = s.getBytes();
        for (byte aByte : bytess) {
            System.out.println(aByte);
        }

        String replace = s.replace("齐", "天");
        System.out.println(replace);

    }
}
