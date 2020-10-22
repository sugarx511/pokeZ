package cn.tangz.service.impl;

import cn.tangz.constant.TypeEnum;
import cn.tangz.service.TypeService;
import org.springframework.stereotype.Service;

/**
 * @author: tz
 * @create: 2020-10-12
 **/
@Service
public class TypeServiceImpl implements TypeService {

    private static final double E = 0.5;

    private static final double X = 0;

    private static final double O = 1;

    private static final double V = 2;

    private static final double[][] TYPE_RESTRAINT =
            {
                    {O, O, O, O, O, O, O, E, O, O, X, O, O, O, E, O, O, O},
                    {O, E, V, E, O, V, O, V, O, O, O, O, O, O, O, O, E, O},
                    {O, E, E, V, O, O, O, E, O, O, O, O, V, O, V, V, E, O},
                    {O, V, E, E, O, V, E, V, O, O, O, O, E, E, E, O, E, O},
                    {O, V, O, E, E, X, V, O, O, O, O, O, O, O, O, O, E, O},
                    {O, O, V, E, V, O, X, V, O, O, O, O, E, V, V, O, O, O},
                    {O, O, O, V, E, O, O, E, V, O, O, O, V, O, E, O, O, O},
                    {O, O, V, O, O, E, V, O, E, O, O, O, V, O, E, V, O, O},
                    {V, O, O, O, O, O, E, V, O, E, X, V, E, E, V, V, O, E},
                    {O, O, O, O, O, O, O, O, V, E, O, X, O, V, E, O, O, O},
                    {X, O, O, O, O, O, O, O, O, V, V, E, O, O, O, O, O, O},
                    {O, O, O, O, O, O, O, O, E, V, V, E, O, O, O, O, O, E},
                    {O, O, E, V, O, O, E, O, E, V, E, V, O, E, E, O, O, E},
                    {O, O, O, V, O, E, O, E, V, O, E, O, O, E, X, O, O, V},
                    {O, E, E, O, E, O, O, V, O, O, O, O, O, O, E, V, O, V},
                    {O, E, E, V, O, V, V, O, O, O, O, O, O, O, E, E, V, O},
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, E, O, V, X},
                    {O, O, E, O, O, O, O, O, V, O, O, O, V, E, E, O, V, O}
            };

    @Override
    public double getRestraint(String atType, String deType) {
        int atTypeNum = TypeEnum.getTypeNum(atType);
        int deTypeNum = TypeEnum.getTypeNum(deType);
        if (atTypeNum < 0 || deTypeNum < 0) {
            return -1;
        } else {
            return TYPE_RESTRAINT[atTypeNum][deTypeNum];
        }
    }

    @Override
    public double getRestraint(String atType, String deType, String deType2) {
        int atTypeNum = TypeEnum.getTypeNum(atType);
        int deTypeNum = TypeEnum.getTypeNum(deType);
        int deTypeNum2 = TypeEnum.getTypeNum(deType2);
        if (atTypeNum < 0 || deTypeNum < 0 || deTypeNum2 < 0) {
            return -1;
        } else {
            return TYPE_RESTRAINT[atTypeNum][deTypeNum] * TYPE_RESTRAINT[atTypeNum][deTypeNum2];
        }
    }
}
