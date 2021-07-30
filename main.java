import java.util.*;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] field = new int[5][5];
        for(int i = 0;i < field.length;i++){
            for(int n = 0;i < field.length;n++){
                field[i][n] = 0;
            }
        }
        d("戦艦ゲーム");
        d("----------");
        Random randum = new Random();
        int num = randum.nextInt(5);
        Ship ship = new Ship();
        int cnt = 1;       
        d("----[ターン"+cnt+"]----");
        d("船1:");
        d("船2:");
        d("船3:");
        d("x座標を入力してください(1～5)");
        int x = sc.nextInt();
        d("y座標を入力してください(1～5)");
        int y = sc.nextInt();       
        Ship.bomb(x,y);
        sc.close();
    }
    public static void d(String a){
        System.out.println(a);
    }
}