/**
 * @author yzhi
 * @date 2012-1-29 上午10:07:10
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.behaviour.iterator;

/**
 * 抽象迭代器
 * @author YZhi
 * @since 1.0
 * @param <E>
 */
public interface Iterator<E> {
    Object next();

    boolean hasNext();

    boolean remove();
}
