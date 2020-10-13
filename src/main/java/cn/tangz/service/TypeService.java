package cn.tangz.service;

/**
 * @author: tz
 * @create: 2020-10-12
 **/
public interface TypeService {

    double getRestraint(String atType, String deType);

    double getRestraint(String atType, String deType, String deType2);
}
