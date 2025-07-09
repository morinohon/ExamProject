public abstract class Character implements Creature{
    public void name(String name){
    }
    public void hp(int hp){
        if(hp <= 0){
            throw new IllegalArgumentExceptionthrow("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }
}
