package cn.tangz.constant;

/**
 * 属性
 *
 * @author: tz
 * @create: 2020-10-12
 **/
public enum TypeEnum {

    /**
     * 一般
     */
    NORMAL("一般", 0),

    /**
     * 水
     */
    WATER("水", 1),

    /**
     * 火
     */
    FIRE("火", 2),

    /**
     * 草
     */
    GRASS("草", 3),

    /**
     * 格斗
     */
    FIGHTING("格斗", 0),



    /**
     * 飞行
     */
    FLYING("飞行", 2),

    /**
     * 地面
     */
    GROUND("地面", 3),

    /**
     * 虫
     */
    BUG("虫", 4),

    /**
     * 钢
     */
    STEEL("钢", 5),



    /**
     * 电
     */
    ELECTRIC("电", 7),

    /**
     * 冰
     */
    ICE("冰", 8),

    /**
     * 恶
     */
    DARK("恶", 9),

    /**
     * 毒
     */
    POISON("毒", 10),

    /**
     * 岩石
     */
    ROCK("岩石", 11),

    /**
     * 幽灵
     */
    GHOST("幽灵", 12),



    /**
     * 超能
     */
    PSYCHIC("超能", 15),

    /**
     * 龙
     */
    DRAGON("龙", 16),

    /**
     * 妖精
     */
    FAIRY("妖精", 17);

    private final String name;

    private final int id;

    TypeEnum(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
