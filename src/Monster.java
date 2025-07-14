public abstract class Monster implements Creature{
    String name;
    int hp;
    char suffix;
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public void setName(String name){
        this.name = name;
    }

}
