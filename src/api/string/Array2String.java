package api.string;

/**
 * @author Ann00
 * @date 2020/8/21
 * 拼接字符串
 */
public class Array2String {
    public static void main(String[] args) {
        //定义一个int类型的数组
        int[] arr = {1, 2, 3};
        //调用方法
        String s = arrayToString(arr);
        //输出结果
        System.out.println("s:" + s);
    }

    /**
     * 写方法实现把数组中的元素按照指定的格式拼接成一个字符串
     * 两个明确：
     * 返回值类型：String
     * 参数列表：int[] arr
     */
    public static String arrayToString(int[] arr) {
        // 创建字符串s
        StringBuilder s = new StringBuilder("[");
        // 遍历数组，并拼接字符串
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                s = s.append(arr[x] + "]");
            } else {
                s = s.append(arr[x] + "#");
            }
        }
        return s.toString();
    }

}
