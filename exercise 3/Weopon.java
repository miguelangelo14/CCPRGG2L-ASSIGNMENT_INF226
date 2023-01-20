public class Weopon {

    String name;
    int damage;
    String rarity;
    int attackSpeed;
    public int additionalDamage;

    
    public void sayMySword() {
        System.out.println("My Sword is " + name);
    }
    
    public void MyDamage() {
        System.out.println("My damage is " + damage);

    }

    public void Rarity() {
        System.out.println("My Rarity is " + rarity + name);
    }

    public String NameRare() {
        return this.name + " " + rarity;

    }

    public void attackSpeed() {
        System.out.println("My attack speed is" + attackSpeed);
    }

    public void MyDamage(int addDamage) {
        int newDamage = this.damage + addDamage;
        System.out.println("Damage increased from " + this.damage + " to " + newDamage);
       
        this.damage = newDamage;
    }
   
}


