package cn.tangz.constant;

import org.apache.commons.lang3.StringUtils;

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
    NORMAL("一般", 0, "normal"),

    /**
     * 水
     */
    WATER("水", 1, "water"),

    /**
     * 火
     */
    FIRE("火", 2, "fire"),

    /**
     * 草
     */
    GRASS("草", 3, "grass"),

    /**
     * 电
     */
    ELECTRIC("电", 4, "electric"),

    /**
     * 地面
     */
    GROUND("地面", 5, "ground"),

    /**
     * 飞行
     */
    FLYING("飞行", 6, "flying"),

    /**
     * 岩石
     */
    ROCK("岩石", 7, "rock"),

    /**
     * 格斗
     */
    FIGHTING("格斗", 8, "fighting"),

    /**
     * 超能
     */
    PSYCHIC("超能", 9, "psychic"),

    /**
     * 幽灵
     */
    GHOST("幽灵", 10, "ghost"),

    /**
     * 恶
     */
    DARK("恶", 11, "DARK"),

    /**
     * 虫
     */
    BUG("虫", 12, "bug"),

    /**
     * 毒
     */
    POISON("毒", 13, "poison"),

    /**
     * 钢
     */
    STEEL("钢", 14, "steel"),

    /**
     * 冰
     */
    ICE("冰", 15, "ice"),

    /**
     * 龙
     */
    DRAGON("龙", 16, "dragon"),

    /**
     * 妖精
     */
    FAIRY("妖精", 17, "fairy");

    private final String name;

    private final int id;

    private final String engName;

    TypeEnum(String name, int id, String engName) {
        this.name = name;
        this.id = id;
        this.engName = engName;
    }

    public static int getTypeNum(String type) {
        if (StringUtils.isNotBlank(type)) {
            for (TypeEnum typeEnum : TypeEnum.values()) {
                if (type.equals(typeEnum.name)) {
                    return typeEnum.id;
                }
                if (type.equals(typeEnum.engName)) {
                    return typeEnum.id;
                }
            }
        }
        return -1;
    }
}
