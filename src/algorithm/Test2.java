package algorithm;

public class Test2 {
    //写出代码判断一个整数是不是2的阶次方（请代码实现，谢绝调用API方法）
    public static void main(String[] args) {
        int jcn = 8;
        if (jc(jcn)) {
            System.out.println(jcn + "：是");
        } else {
            System.out.println(jcn + "：不是");
        }
    }

    public static boolean jc(int a) {
        if (a < 2) return false;
        int tmp = a;
        while (tmp > 1) {
            if (tmp % 2 == 0) {
                tmp = tmp / 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
