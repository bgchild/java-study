package api.random;

import java.util.Random;

/**
 * @author Ann00
 */
public class Main {

    public static final int INT = 10;

    public static void main(String[] args) {
        int bd = 10;
        Random rm = new Random();
        for (int i = 0; i < INT; i++) {
            int num = rm.nextInt(bd) + 1;
            System.out.println(num);
        }
    }
}
