/**
 * @author YZhi
 * @date 2012-5-31
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.structure.specification;

/**
 * 或规格书
 * @author YZhi
 * @since 1.0
 */
public class OrSpecification extends CompositeSpecification {
    private ISpecification left;
    private ISpecification right;

    /**
     *
     * @param left
     * @param right
     */
    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    /* (non-Javadoc)
     * @see dp.structure.specification.CompositeSpecification#isSatisfiedBy(java.lang.Object)
     */
    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate);
    }

}
