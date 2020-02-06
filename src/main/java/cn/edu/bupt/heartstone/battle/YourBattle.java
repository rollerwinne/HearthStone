package cn.edu.bupt.heartstone.battle;

import cn.edu.bupt.heartstone.card.Card;
import cn.edu.bupt.heartstone.settings.Constant;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class YourBattle {
    Card[] cards=new Card[Constant.MAX_MONSTER_SIZE];
    Queue<Card> cardSequence = new LinkedBlockingQueue<>();

    public void add(Card card, int pos) {
        if (getCardNum()>Constant.MAX_MONSTER_SIZE)
            return;
        for (int i = Constant.MAX_MONSTER_SIZE-1; i >pos ; i--) {
            cards[i]=cards[i-1];
        }
        cards[pos]=card;
    }

    public boolean delete(Card card){
        for (int i = 0; i < Constant.MAX_MONSTER_SIZE ; i++) {
            if (cards[i].equals(card)){
                for (int j = i; j < Constant.MAX_MONSTER_SIZE-1 ; j++) {
                    cards[j]=cards[j+1];
                }
                return true;
            }
        }
        return false;
    }

    public int getCardNum() {
        int num=0;
        while (cards[num]!=null)
            num++;
        return num;
    }
}

