/**
 * @author yzhi
 * @date 2012-1-29 下午04:23:11
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.behaviour.visitor.employee;

/**
 * 访问者接口
 * @author YZhi
 * @since 1.0
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    int getTotalSalary();
}
