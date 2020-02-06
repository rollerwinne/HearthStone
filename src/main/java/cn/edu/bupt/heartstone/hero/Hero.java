package cn.edu.bupt.heartstone.hero;

import cn.edu.bupt.heartstone.card.WeaponCard;
import cn.edu.bupt.heartstone.hero.skill.Skill;
import cn.edu.bupt.heartstone.settings.Constant;

/**
 * 英雄
 */
abstract public class Hero {
    Skill skill;
    private int blood= Constant.INITIAL_BLOOD;
    private int attack;

    private WeaponCard weaponCard;
}
