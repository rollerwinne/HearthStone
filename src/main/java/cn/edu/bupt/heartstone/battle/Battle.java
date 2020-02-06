package cn.edu.bupt.heartstone.battle;

public class Battle {
    YourBattle yourBattle;
    EnemyBattle enemyBattle;
    private static Battle battle = new Battle();

    private Battle() {
    }

    private static Battle getInstance() {
        return battle;
    }
}
