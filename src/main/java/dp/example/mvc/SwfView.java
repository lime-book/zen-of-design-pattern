/**
 * @author YZhi
 * @date 2012-5-31
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.example.mvc;

import java.util.Map;

/**
 *
 * @author YZhi
 * @since 1.0
 */
public class SwfView extends AbsView {

    /**
     *
     * @param langData
     */
    public SwfView(AbsLangData langData) {
        super(langData);
    }

    /* (non-Javadoc)
     * @see dp.example.mvc.AbsView#assemble()
     */
    @Override
    @SuppressWarnings("unused")
    public void assemble() {
        Map<String, String> langMap = getLangData().getItems();
        for (String key : langMap.keySet()) {

        }
    }

}
