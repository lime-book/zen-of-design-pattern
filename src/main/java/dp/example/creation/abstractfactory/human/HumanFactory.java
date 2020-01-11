/**
 * @author yzhi
 * @date 2012-1-19 下午04:15:30
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.creation.abstractfactory.human;

/**
 *
 * @author YZhi
 * @since 1.0
 */
public interface HumanFactory {
    Human createYellowHuman();

    Human createWhiteHuman();

    Human createBlackHuman();
}
