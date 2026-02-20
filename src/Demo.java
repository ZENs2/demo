import javax.swing.*;
import java.util.Scanner;//Scannerという「キーボード入力用の道具」を使えるようにする宣言

public class Demo {//このファイルの本体。DEMOという名前のプログラム置き場を作っている。
    public  static void main(String[] args){//JAVAはここから動く。実行ボタン開始場所
       Scanner sc = new Scanner(System.in);//system.in=キーボード入力　　Scanner sc=その入力を読み取る係

       while (true) {//繰り返し　break;が来たら抜ける
       System.out.print("名前を入力");//名前を表示
       String name = sc.nextLine();//名前を読み取る→nameに入れる

           int age = inputAge(sc);//inputAge(sc）を使って、年齢を入力させて、正しい値だったらageにいれる
           String result = judgeAge(name, age);//結果の文章(String)をresultに入れる

           System.out.println(result);//結果の出力

           System.out.print("もう一人判定しますか？(y/n): ");//yes/no入力
           String again = sc.nextLine().trim().toLowerCase();
           //入力の癖をなくすコマンドnextline=入力を読む・trim=前後の空白をなくす・tolowercase=小文字にする
           if (!again.equals("y")) break;
           //again.equals("y"):againがyと同じ？（イコール？）・・！＝否定（NOT）・・break=whileの終了
       }//「名前→年齢→判定→続ける？」の１セットが終わり、またwhile(true)に戻る。

        System.out.println("終了します。");//ループ抜けた後の処理
        sc.close();
    }
//ここから下は部品（メソッド）ゾーン！！
    public static int inputAge(Scanner sc) {//inputageという部品の名前
        while (true) {
            System.out.print("年齢を入力(0歳以上): ");//入力を出力
            String ageStr = sc.nextLine();//とりあえずキーボード入力を文字として読み込んでおく

            try {//tyr--catchはエラーが起きた時どうするかを書く構文（今回の場合文字入力だった場合でも止めない処理を）
                int age = Integer.parseInt(ageStr);//文字を数字に変換
                if (age >= 0) return age;//return age=このメソッドの答えとしてageを外へ渡す
                System.out.println("0歳以上の年齢を入力してください。");//マイナスなら入力ループへ
            } catch (NumberFormatException e) {//tryブロックが終わり
                System.out.println("数字で入力してください。");//whileの先頭に戻る
            }
        }//whileの終わり
    }//inputAgeメソッドの終わり

    //判定メソッドの開始
    public static String judgeAge(String name, int age) {//名前と年齢を受け取り、Stringに返す
        if (age <= 12) {//returnを使ってできた文章を13行目の左に入れる
            return name + "さんは子どもです。";
        } else if (age <= 19) {
            return name + "さんは未成年です。";
        } else if (age <= 64) {
            return name + "さんは成人です。";
        } else {
            return name + "さんは高齢者です。";
        }
    }
}