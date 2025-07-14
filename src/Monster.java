public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public Monster(String name, int hp, char suffix) {
        if(hp <= 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.suffix = suffix;
        this.hp = hp;
    }
    public final boolean isAlive(){
        return getHp() > 0;
    }
    public void showStats() {
        System.out.println(getName() + ":HP" + getHp());
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }
}
