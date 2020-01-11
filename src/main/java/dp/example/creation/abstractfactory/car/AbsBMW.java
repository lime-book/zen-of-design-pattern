/**
 * @author YZhi
 * @date 2012-5-17
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.example.creation.abstractfactory.car;

/**
 * 抽象宝马车
 * @author YZhi
 * @since 1.0
 */
public abstract class AbsBMW implements ICar {
    private final String BMW_BAND = "BMW Car";

    public String getBand() {
        return BMW_BAND;
    }

    public abstract String getModel();
}
