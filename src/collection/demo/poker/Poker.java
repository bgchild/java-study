package collection.demo.poker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Ann
 */
public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>(54);
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        String[] color = {"红桃", "黑桃", "方块", "梅花"};
        String[] pai = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};

        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        for (String s : pai) {
            for (String value : color) {
                index++;
                poker.put(index, value + s);
                pokerIndex.add(index);
            }
        }
        System.out.println(poker);
    }
}
