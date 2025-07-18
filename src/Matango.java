public class Matango extends Monster{
    public Matango(char suffix, int hp){
        super("お化けキノコ", hp , suffix);
    }

    @Override
    public void attack(Creature target) {
        int damage = 6;
        System.out.println(this.getName() + getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(this.getHp() - damage);
    }
}
