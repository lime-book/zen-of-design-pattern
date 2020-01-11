/**
 * @author YZhi
 * @date 2012-5-31
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.structure.specification;

/**
 *
 * @author YZhi
 * @since 1.0
 */
public interface ISpecification {
    /**
     * 候选者是否满足要求
     * @param candidate
     * @return
     */
    boolean isSatisfiedBy(Object candidate);

    /**
     * and操作
     * @param spec
     * @return
     */
    ISpecification and(ISpecification spec);

    /**
     * or操作
     * @param spec
     * @return
     */
    ISpecification or(ISpecification spec);

    /**
     * not操作
     * @return
     */
    ISpecification not();
}
