public class App {
    public static void main(String[] args) {


        Character Soldier = new Character();
        Soldier.MyAttack();

        Weopon Sword = new Weopon();
        Sword.name = "Pochita";
        Sword.damage = 75;
        Sword.rarity = "Epic";
        Sword.attackSpeed = 50;
        Sword.sayMySword();
        Sword.MyDamage(100);
        Sword.NameRare();
        System.out.println(Sword.NameRare());
      

    }
}
