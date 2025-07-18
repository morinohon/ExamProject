public class Goblin extends Monster {
    public Goblin(char suffix, int hp) {
        super("ゴブリン", hp, suffix);
    }
    @Override
    public void attack(Creature target){
        int damage = 8;
        System.out.println(this.getName() + getSuffix() + "はナイフで切りつけた！" + target.getName() + "に8ダメージを与えた！");
        target.setHp(this.getHp() - damage);
    }
}
