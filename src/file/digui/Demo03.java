package file.digui;/**
 *
 * @author Ann00
 * @date 2020/8/20
 * 递归阶层 n! = n * (n‐1) *...* 3 * 2 * 1
 */
public class Demo03 {
    public static void main(String[] args) {
       int snum = jiecheng(4);
        System.out.println(snum);
    }

    public static int jiecheng(int num){
        if (num == 1){
            return num;
        }
        return num * jiecheng(num-1);
    }
}
