package strategy.weapon;

public interface Weapon {
    String getName();
    int calcWeaponWeight(int damage); // 무기 가중치
    void attack(); // 공격시 출력 메세지
}
