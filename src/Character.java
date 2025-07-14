import java.io.*;

public abstract class Character implements Creature{
    private String name;
    private int hp;

    public void name(String name){
    }
    private void getHp(int hp){
        if(hp <= 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
    public final boolean isAlive(){
        return getHp() > 0;
    }
    public void showStatus(String name, int hp){
        System.out.println("[" + this.name + "]" + ":HP[" + this.hp + "]" );
    }
    private void setHp(){
        if(hp > 0){
            this.hp = hp;
        }
    }
}
