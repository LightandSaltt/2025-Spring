package strategy;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import strategy.character.Beginner;
import strategy.character.Character;
import strategy.character.Monster;
import strategy.character.Player;
import strategy.character.Warrior;
import strategy.weapon.Gun;
import strategy.weapon.Sword;
import strategy.weapon.Weapon;

public class Run {

    public static void main(String[] args) {


        Player beginner = new Beginner("초보자", 100, 20, 10);
        Player warrior = new Warrior("전사", 100, 20, 10);

        battle(warrior);
    }

    private static void battle(Player player) {
        Scanner sc = new Scanner(System.in);
        Monster monster = new Monster("슬라임", 100, 20, 10);
        System.out.println(monster.getName() + " 등장했습니다!");

        List<Weapon> weapons = List.of(
            new Sword("롱소드", 10),
            new Sword("듀란달", 10),
            new Sword("엑스칼리버", 10),
            new Gun("K2C1", 20),
            new Gun("K3", 30)
        );

        while (true) {
            if(player.isDead()) {
                System.out.println("system : 패배");
                break;
            }

            if (monster.isDead()) {
                System.out.println("system : 승리!");
                break;
            }
            System.out.println("\n=================================\n");
            sc.nextLine();

            Random random = new Random();
            int eventTrigger = random.nextInt(0, 1);
            int itemIndex = random.nextInt(0, weapons.size());
            player.equippedWeapon(weapons.get(itemIndex)); // 템 장착


            player.attack(monster);
            monster.attack(player);

        }
    }

}
