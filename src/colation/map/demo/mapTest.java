package colation.map.demo;

/**
 * @author Ann00
 * @date 2020/8/19
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * 1. 获取一个字符串对象
 * 2. 创建一个Map集合，键代表字符，值代表次数。
 * 3. 遍历字符串得到每个字符。
 * 4. 判断Map中是否有该键。
 * 5. 如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
 * 6. 打印最终结果
 */
public class mapTest {
    public static void main(String[] args) {
        System.out.println("请输入字符：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        findCharCount(line);
        scanner.close();
    }

    public static void findCharCount(String inStr){
        char[] inArr = inStr.toCharArray();
        HashMap<Character, Integer> resMap = new HashMap<>();
        for (char c : inArr) {
            if(resMap.containsKey(c)){
                resMap.put(c,resMap.get(c) + 1);
            }else{
                resMap.put(c,1);
            }
        }
        System.out.println(resMap);
    }

}
