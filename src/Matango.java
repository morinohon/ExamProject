public class Matango extends Monster{
    public Matango(char suffix, int hp){
        super("お化けキノコ", hp , suffix);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(this.getHp() - 6);
    }
}
