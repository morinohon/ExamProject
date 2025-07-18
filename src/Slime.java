public class Slime extends Monster {
    public Slime(char suffix, int hp) {
        super("スライム", hp , suffix);
    }

    public void attack(Creature target) {
        int damage = 5;
        System.out.println(this.getName() + getSuffix() + "は体当たり攻撃！" + target.getName() + "に5のダメージを与えた！");
        target.setHp(this.getHp() - damage);
    }
}
