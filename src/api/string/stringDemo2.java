package api.string;

/**
 * @author Ann00
 * @date 2020/8/21
 * public int length () ：返回此字符串的长度。
 * public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
 * public char charAt (int index) ：返回指定索引处的 char值。
 * public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
 * public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符
 * 串结尾。
 * public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
 */
public class stringDemo2 {
    public static void main(String[] args) {
        String s = new String("我是一只小小鸟");
        System.out.println(s.length());
        String sc = s.concat("想要飞确飞不高");
        System.out.println(sc);
        System.out.println(sc.charAt(6));
        System.out.println(sc.indexOf("鸟"));
        System.out.println(sc.substring(0,7));
    }
}
