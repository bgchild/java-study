public class Test {


    //214、5、647
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.largestPalindrome(3));
//        abbaa
//        aabba
    }


    public int largestPalindrome(int n) {
        if (n == 1) return 9;
        int ans = 0;
        int maxNum = (int) (Math.pow(10, n) - 1);
        int minNum = (int) Math.pow(10, n - 1);
        for (int i = maxNum; i >= minNum; i--) {
            for (int j = maxNum; j * j >= ans; --j) {
                int temp = i * j;
                String rev = new StringBuilder(String.valueOf(temp)).reverse().toString();
                if (rev.equals(String.valueOf(temp))) {
                   return temp % 1337;
                }
            }
        }
        return 0;
    }
}




