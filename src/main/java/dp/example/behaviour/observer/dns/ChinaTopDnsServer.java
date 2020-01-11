/**
 * @author YZhi
 * @date 2012-5-24
 * @copyright 2012 haitian.com All rights reserved
 * @since V1.0
 */
package dp.example.behaviour.observer.dns;

import dp.example.behaviour.chainofresponsibility.dns.Recorder;

/**
 * 中国DNS
 * @author YZhi
 * @since 1.0
 */
public class ChinaTopDnsServer extends DnsServer {

    /* (non-Javadoc)
     * @see dp.example.behaviour.observer.dns.DnsServer#isLocal(dp.example.behaviour.chainofresponsibility.dns.Recorder)
     */
    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomian().endsWith(".cn ");
    }

    /* (non-Javadoc)
     * @see dp.example.behaviour.observer.dns.DnsServer#sign(dp.example.behaviour.chainofresponsibility.dns.Recorder)
     */
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("China TOP DNS");
    }

}
