package dp.behaviour.visitor;

/**
 * 抽象访问者
 *
 * @author YZhi
 * @since 1.0
 */
public interface IVisitor {
    void visit(ConcreteElementA ceA);

    void visit(ConcreteElementB ceB);
}
