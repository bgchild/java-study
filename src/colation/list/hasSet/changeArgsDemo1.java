package colation.list.hasSet;

/**
 * @author Ann00
 * @date 2020/8/18
 * 保证唯一、不保证顺序
 */
public class changeArgsDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 62, 431, 2};
        int sum = getSum(arr);
        System.out.println(sum);

        int sum1 = getSum(6, 7, 8, 9);
        System.out.println(sum1);

    }

    public static int getSum(int... args){
        int sum = 0;
        for (int a: args){
            sum+=a;
        }
        return sum;
    }
}
