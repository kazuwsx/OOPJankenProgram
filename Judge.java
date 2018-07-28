/**
*ジャンケンの審判を表すクラス
*/

public class Judge
{
    public void startJanken(Player player1, Player player2)
    {
        System.out.println("[ジャンケン開始]\n");

        for (int cnt = 0; cnt < 3; cnt++)
        {
            System.out.println("[" + (cnt + 1) + "回戦目]");

            Player winner = judgeJanken(player1, player2);

            if (winner != null)
            {
                System.out.println("\n" + winner.getName() + "が勝ちました！\n");
                //勝ったプレイヤーに結果を伝える
                winner.notifyResult(true);
            }
            else
            {
                System.out.println("\n引き分けです！\n");
            }
        }

        System.out.println("[ジャンケン終了]\n");

        Player finalWinner = judgeFinalWinner(player1, player2);

        System.out.print(player1.getWinCount() + " 対 " + player2.getWinCount() + "で");
        if (finalWinner != null)
        {
            System.out.println(finalWinner.getName() + "の勝ちです！\n");
        }
        else
        {
            System.out.println("引き分けです！\n");
        }
    }

    /**
    *勝ち負けの判定
    *@param player1 判定対象プレイヤー１
    * @param player2 判定対象プレイヤー2
    * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
    */
    private Player judgeJanken(Player player1, Player player2)
    {
        Player winner = null;
        //player１の手を出す
        int player1hand =  player1.showHand();
        //player２の手を出す
        int player2hand =  player2.showHand();


        printHand(player1hand);
        System.out.println(" vs ");
        printHand(player2hand);
        System.out.print("\n");

        //プレイヤー1が勝つ場合
        if ((player1hand == Player.STONE && player2hand == Player.SCISSORS)
            || (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
            || (player1hand == Player.PAPER && player2hand == Player.STONE))
        {
            winner = player1;
        }
        //プレイヤー２が勝つ場合
        else if ((player1hand == Player.STONE && player2hand == Player.PAPER)
            || (player1hand == Player.SCISSORS && player2hand == Player.STONE)
            || (player1hand == Player.PAPER && player2hand == Player.SCISSORS))
        {
            winner = player2;
        }

        return winner;
    }

    /**
    *最終的な勝者を判定する
    *@param player1 判定対象プレイヤー1
    *@param player2 判定対象プレイヤー2
    *@return 勝ったプレイヤー。引き分けの場合はnullを返す
    */
    private Player judgeFinalWinner(Player player1, Player player2)
    {
        Player winner = null;

        //Player1から勝ち数を聞く
        int player1WinCount = player1.getWinCount();
        //Player2から勝ち数を聞く
        int player2WinCount = player2.getWinCount();

        if (player1WinCount > player2WinCount)
        {
            winner = player1;
        }
        else if (player1WinCount < player2WinCount)
        {
            winner = player2;
        }

        //引き分けの場合はnullを返す
        return winner;
    }

    /**
    *ジャンケンの手を表示する
    *@param hand ジャンケンの手
    */

    private void printHand(int hand)
    {
        switch (hand)
        {
            case Player.STONE :
                System.out.print("グー");
                break;

            case Player.SCISSORS :
                System.out.print("チョキ");
                break;

            case Player.PAPER :
                System.out.print("パー");
                break;

            default :
                break;
        }
    }
}
