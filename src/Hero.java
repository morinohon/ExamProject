public class Hero extends Character{
    private String weapon;
    public Hero(String name, int hp, String weapon){
        super(name, hp);
        this.weapon = weapon;
    }
    public void attack(Creature target){
        int damage = 10;
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - damage);
    }
    public String getWeapon(){
        return this.weapon;
    }
    public void setWeapon(){
        this.weapon = weapon;
    }
}

