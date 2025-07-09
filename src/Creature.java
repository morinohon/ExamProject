public interface Creature {
    void name();
    void hp();

    public static boolean isAlive(){
        return true;
    }
    /*public void showStatus(){
    }*/

    public default void showStatus(){
    }
    public default void attack(Creature target){
    }
    public default String getName(){
        return this.name();
    }
    public default int getHp(){
        return this.hp();
    }
    public default void setHp(int hp) {
        this.hp() = hp;
    }
}
