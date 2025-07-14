public class Hero extends Character{
    String weapon;
    public Hero(String name, int hp, String weapon){
        super(name, hp, weapon);
        this.weapon = weapon;
    }
    public void attack(Creature target){
        System.out.println(getName() + "は" + this.weapon + "で攻撃！" + getName() + "に10のダメージを与えた！");
        target.hp =- 10;
    }
    public String getWeapon(){
        return this.weapon;
    }
    public void setWeapon(){
        this.weapon = weapon;
    }
}

