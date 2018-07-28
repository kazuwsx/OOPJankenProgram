/**
*オブジェクト指向によるジャンケンプログラム
*戦術インタフェースに対応
*/
public class ObjectJanken
{
    public static void main(String[] args)
    {
        //審判のインスタンスの生成
        Judge judge = new Judge();

        //プレイヤー１（村田さん）の生成
        Player murata = new Player("村田さん");

        //村田さんに渡す戦略クラスを生成する
        Tactics murataTactics = new CyclicTactics();

        //村田さんに戦略クラスを渡す
        murata.setTactics(murataTactics);

        //プレイヤー２（山田さん）の生成
        Player yamada = new Player("山田さん");

        //山田さんに渡す戦略クラスを生成
        Tactics yamadaTactics = new CyclicTactics();

        //山田さんに戦術クラスを渡す
        yamada.setTactics(yamadaTactics);

        //村田さんと山田さんをプレイヤーとしてジャンケンを開始する
        judge.startJanken(murata,yamada);
    }
}
