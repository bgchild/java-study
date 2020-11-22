package api.statickey;

import java.util.ArrayList;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class gameDemo {
    public static void main(String[] args) {
        Game game = new Game();
        ArrayList<String> list = game.getList();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
