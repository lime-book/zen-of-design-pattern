/**
 * @author YZhi
 * @date 2012-5-22
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.example.structure.decorator.duck;

/**
 * 丑小鸭
 * @author YZhi
 * @since 1.0
 */
public class UglyDuckling implements Swan {

    /* (non-Javadoc)
     * @see dp.example.structure.decorator.duck.Swan#cry()
     */
    @Override
    public void cry() {
        System.out.println("UglyDuckling cry");
    }

    /* (non-Javadoc)
     * @see dp.example.structure.decorator.duck.Swan#desAppearance()
     */
    @Override
    public void desAppearance() {
        System.out.println("UglyDuckling desAppearance");
    }

    /* (non-Javadoc)
     * @see dp.example.structure.decorator.duck.Swan#fly()
     */
    @Override
    public void fly() {
        System.out.println("UglyDuckling cann`t fly");
    }

}
