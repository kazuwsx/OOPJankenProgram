/**
*ジャンケンのプレイヤーを表すクラス
*/
public class Player
{
    //ジャンケンの手を表す定数
    public static final int STONE = 0;  //グー
    public static final int SCISSORS = 1;//チョキ
    public static final int PAPER = 2;  //パー

    //------------------------------
    //プレイヤークラスの属性
    //------------------------------
    //プレイヤーの名前
    private String name_;

    //プレイヤーの勝った回数
    private int winCount_ = 0;

    //------------------------------
    //プレイヤークラスの操作
    //------------------------------
    //プレイヤークラスのコンストラクタ
    public Player(String name)
    {
        name_ = name;
    }

    /**与えられた戦術*/
    private Tactics tactics_;
    /**
    *プレイヤーに戦略を渡す
    *@params tactics 戦術
    */
    void setTactics(Tactics tactics)
    {
        tactics_ = tactics;
    }

    //ジャンケンの手を出す
    public int showHand()
    {
        // //プレイヤーの手
        // int hand = 0;
        // //０以上３未満の少数として乱数を得る
        // double randomNum = Math.random() * 3;
        // if (randomNum < 1) {
        //     hand = STONE;
        // }
        // else if (randomNum < 2)
        // {
        //     hand = SCISSORS;
        // }
        // else if (randomNum < 3)
        // {
        //     hand = PAPER;
        // }
        //プレイヤーの手
        int hand = 0;
        //０以上３未満の少数として乱数を得る
        int tacticsHand = Tactics.readTactics();

        if (tacticsHand = 1) {
            hand = STONE;
        }
        else if (tacticsHand = 2)
        {
            hand = SCISSORS;
        }
        else if (tacticsHand = 3)
        {
            hand = PAPER;
        }



        //決定した手を戻り値として返す
        return hand;
    }

    //勝った回数を数える
    public void notifyResult(boolean result)
    {
        if(result == true)
        {
            winCount_ += 1;
        }
    }

    public int getWinCount()
    {
        return winCount_;
    }

    public String getName()
    {
        return name_;
    }

}
