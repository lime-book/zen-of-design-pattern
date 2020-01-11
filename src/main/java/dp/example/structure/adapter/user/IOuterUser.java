/**
 * @author yzhi
 * @date 2012-1-29 上午08:47:31
 * @copyright 2012 haitian.com All rights reserved
 * @version V1.0
 */
package dp.example.structure.adapter.user;

import java.util.Map;

/**
 * 劳务公司的人员信息接口
 * @author YZhi
 * @since 1.0
 */
public interface IOuterUser {
    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserHomeInfo();
}
