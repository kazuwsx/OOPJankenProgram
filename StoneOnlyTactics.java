/**
*「グーが大好き！」戦術クラス。
*/
public class StoneOnlyTactics implements Tactics
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
        //必ずグーを出す
        return Player.STONE;
    }
}
