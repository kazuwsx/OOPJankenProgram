/**
*ランダムに手を決める戦術クラス
*/
public class RandomTactics implements Tactics
{
    /**
    *戦術を読み、ジャンケンの手を得る
    *グー・チョキ・パーのいずれかをplayerクラスに定義された
    *以下の定数で返す
    *Player.STONE    ••• グー
    *Player.SCISSORS ••• チョキ
    *player.PAPER    ••• パー
    *
    *@return ジャンケンの手
    */
    public int readTactics()
    {
        //プレイヤーの手
        int hand = 0;

        //0以上3未満の少数として乱数を得る
        double randomNum = Math.random() * 3;
        if (randomNum < 1)
        {
            // randomNumが０以上１未満の場合・・・グー
            hand = Player.STONE;
        }
        else if (randomNum < 2)
        {
            // randomNumが１以上２未満の場合・・・チョキ
            hand = Player.SCISSORS;
        }
        else if (randomNum < 3)
        {
            // randomNumが２以上３未満の場合・・・パー
            hand = Player.PAPER;
        }

        //決定した手を戻り値として返す
        return hand;
    }
}
