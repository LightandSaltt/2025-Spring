package strategy.weapon;

public class Sword implements Weapon{

    private String name;
    private int atk;

    public Sword( String name, int atk) {
        this.atk = atk;
        this.name = name;
    }

    @Override
    public int calcWeaponWeight(int damage) {
        return (int) (damage + atk * 1.2); // normal 등급 무기
    }

    @Override
    public void attack() {
        System.out.println(name + "을 날카롭게 휘두릅니다. 쉭쉭");
    }

    @Override
    public String getName() {
        return name;
    }
}
