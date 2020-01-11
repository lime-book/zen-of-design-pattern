/**
 * @author yzhi
 * @date 2012-1-20 下午04:29:22
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.behaviour.strategy.zhaoyun;

/**
 * 孙夫人断后
 * @author YZhi
 * @since 1.0
 */
public class BlockEnemy implements IStrategy {

    /* (non-Javadoc)
     * @see behaviour.strategy.example.zhaoyun.IStrategy#operate()
     */
    @Override
    public void operate() {
        System.out.println("blockEnemy");
    }

}
