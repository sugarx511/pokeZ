package cn.tangz.service.impl;

/**
 * @author: tz
 * @create: 2020-10-12
 **/
public class TypeServiceImpl {

    private static final double U = 0.5;

    private static final double X = 0;

    private static final double O = 1;

    private static final double V = 2;


    private static final double[][] TYPE_RESTRAINT =
            {     // 普 水 火  草 电 地  飞 岩 斗  超 鬼 恶 虫  毒 钢  冰 龙 妖
                    {O, O, O, O, O, O, O, O, O, O, X, O, O, O, U, O, O, O}, //普
                    {O, U, V, U, O, V, O, V, O, O, O, O, O, O, O, O, O, O}, //水
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //火
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //草
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //电
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //地
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //飞
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //岩
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //斗
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //超
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //鬼
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //恶
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //虫
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //毒
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //钢
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //冰
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}, //龙
                    {O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O, O}  //妖
            };
}
