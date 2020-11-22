package colation.map.demo.poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ann
 */
public class PokerPlay {
    public static void main(String[] args) {
        //斗地主扑克牌
        //洗牌
        //发牌
        ArrayList<String> poker = new ArrayList();
        ArrayList<String> play1 = new ArrayList();
        ArrayList<String> play2 = new ArrayList();
        ArrayList<String> play3 = new ArrayList();
        ArrayList<String> diPai = new ArrayList();
        String[] huaSe = {"红桃", "黑桃", "方块", "梅花"};
        String[] pai = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
        //准备牌
        poker.add("大王");
        poker.add("小王");
        for (String s : pai) {
            for (String value : huaSe) {
                poker.add(value + s);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                //发底牌
                diPai.add(poker.get(i));
            } else if (i % 3 == 0) {
                //给玩家1发牌
                play1.add(poker.get(i));
            } else if (i % 3 == 1) {
                //给玩家2发牌
                play2.add(poker.get(i));
            } else {
                //给玩家3发牌
                play3.add(poker.get(i));
            }
        }
        System.out.println("玩家1" + play1);
        System.out.println("玩家2" + play2);
        System.out.println("玩家3" + play3);
        System.out.println("底牌" + diPai);
    }
}
