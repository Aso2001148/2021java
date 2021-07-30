public class Ship{
    public int x;
    public int y;
    public int hp;

    
    public static String shiphp(int hp){
        if(hp > 0){
            return "生きてる";
        }else{
            return "撃沈済み";
        }
    }
    public static void bomb(int x,int y){
        d("はずれ！");
        d("波高し！");
        d("爆弾が当たった！しかし船はまだ沈まない！船は移動します");
        d("爆弾が当たった！撃沈しました！");
    }
    public static void d(String a){
        System.out.println(a);
    }
}