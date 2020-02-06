package cn.edu.bupt.heartstone.card;

import cn.edu.bupt.heartstone.card.effect.DeathrattleEffect;
import cn.edu.bupt.heartstone.card.effect.Effect;
import cn.edu.bupt.heartstone.card.effect.HurtEffect;

import java.util.ArrayList;

public class MonsterCard extends Card {
    protected int attack;
    protected int blood;

    protected ArrayList<Effect> effects;

    public void attack(MonsterCard monsterCard) {
        this.blood -= monsterCard.attack;
        monsterCard.blood -= this.attack;
        if (this.blood <= 0)
            this.dead();
        if (monsterCard.blood <= 0)
            monsterCard.dead();
    }

    public void dead() {
        for (Effect e : effects) {
            if (e instanceof DeathrattleEffect) {
                e.doEffect();
            }
        }
    }

    public void hurt() {
        for (Effect e : effects) {
            if (e instanceof HurtEffect) {
                e.doEffect();
            }
        }
    }
}
