public class Wizard extends Character{
    private int mp;
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
    }
    public void attack(Creature target) {
        int damage = 3;
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に3ダメージを与えた！");
        target.setHp(target.getHp() - damage);
        mp -= 1;
    }
}
