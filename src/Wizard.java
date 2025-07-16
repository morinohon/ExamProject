public class Wizard extends Character{
    private int mp;
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に3ダメージを与えた！");
        target.setHp(target.getHp() - 3);
        mp -= 1;
    }
}
