/**
 * @author yzhi
 * @date 2012-1-19 上午09:15:43
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.structure.proxy.gameplayer;

/**
 * 游戏者接口
 * @author YZhi
 * @since 1.0
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void killBossInForceProxy();

    void upgrade();

    IGamePlayer getProxy();
}
