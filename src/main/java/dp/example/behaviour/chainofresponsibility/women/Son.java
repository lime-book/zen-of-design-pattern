/**
 * @author yzhi
 * @date 2012-1-20 下午03:44:49
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.behaviour.chainofresponsibility.women;

/**
 * 儿子
 * @author YZhi
 * @since 1.0
 */
public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    /* (non-Javadoc)
     * @see behavior.chainofresponsibility.example.women.Handler#response(behavior.chainofresponsibility.example.women.IWomen)
     */
    @Override
    protected void response(IWomen women) {
        System.out.println(women.getRequest());
        System.out.println("son agree");
    }

}
