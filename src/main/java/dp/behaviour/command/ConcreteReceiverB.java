/**
 * @author yzhi
 * @date 2012-1-20 上午11:28:35
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.behaviour.command;

/**
 * 具体接收者A
 * @author YZhi
 * @since 1.0
 */
public class ConcreteReceiverB extends Receiver {

    /* (non-Javadoc)
     * @see behaviour.command.Receiver#doSomething()
     */
    @Override
    public void doSomething() {
        System.out.println("doSomething in ConcreteReceiverB");
    }

}
