package strategy.character;

import java.util.Random;
import strategy.weapon.Weapon;

public abstract class AbstractCharacter implements Character {

    private String name;
    private int hp;
    private int currentHp;
    private int atk;
    private int def;
    protected Weapon weapon;


    public AbstractCharacter(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.currentHp = hp; // 풀피 시작
        this.atk = atk;
        this.def = def;
    }

    // 전체 흐름 Context
    @Override
    public void attack(Character target) {
        Random random = new Random();
        int damage = random.nextInt(atk/2, atk*2);
        damage = calAtkWeight(damage);
        if (weapon != null) {
            damage = weapon.calcWeaponWeight(damage);
        }
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        damage = calDefWeight(damage);
        damage = Math.max(damage, 0);

        this.currentHp -= damage;
        this.currentHp = Math.max(currentHp, 0);

        System.out.println(name + " " + damage + " 데미지를 받았습니다.");
        System.out.println(name + " " + "체력 : " + currentHp);
    }

    public boolean isDead() {
        return currentHp <= 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    protected abstract int calAtkWeight(int damage);
    protected abstract int calDefWeight(int damage);
}
