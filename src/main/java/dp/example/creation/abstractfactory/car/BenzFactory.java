/**
 * @author YZhi
 * @date 2012-5-17
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.example.creation.abstractfactory.car;

/**
 * Benz工厂
 * @author YZhi
 * @since 1.0
 */
public class BenzFactory implements CarFactory {

    /* (non-Javadoc)
     * @see dp.example.creation.abstractfactory.car.CarFactory#createSuv()
     */
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    /* (non-Javadoc)
     * @see dp.example.creation.abstractfactory.car.CarFactory#createVan()
     */
    @Override
    public ICar createVan() {
        return new BenzVan();
    }

}
