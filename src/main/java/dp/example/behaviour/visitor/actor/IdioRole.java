/**
 * @author yzhi
 * @date 2012-1-29 下午05:16:20
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.behaviour.visitor.actor;

/**
 * 白痴角色
 * @author YZhi
 * @since 1.0
 */
public class IdioRole implements Role {
    /* (non-Javadoc)
     * @see behaviour.visitor.example.actor.Role#accept(behaviour.visitor.example.actor.AbsActor)
     */
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
