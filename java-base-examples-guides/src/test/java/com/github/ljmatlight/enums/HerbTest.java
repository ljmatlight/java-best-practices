package com.github.ljmatlight.enums;

import com.github.ljmatlight.enums.Herb.Type;
import org.junit.Test;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Description：用 EnumMap 代替序数索引 - A
 * <br /> Author： galsang
 */
public class HerbTest {

    /**
     * 使用序数索引案例
     */
    @Test
    public void test() {

        // 花园
        Herb[] garden = new Herb[]{
                new Herb("一年生植物-A", Type.ANNUAL),
                new Herb("一年生植物-B", Type.ANNUAL),
                new Herb("一年生植物-C", Type.ANNUAL),
                new Herb("二年生植物-A", Type.BIENNAL),
                new Herb("二年生植物-B", Type.BIENNAL),
                new Herb("二年生植物-C", Type.BIENNAL),
                new Herb("多年生植物-A", Type.PERENNIAL),
                new Herb("多年生植物-B", Type.PERENNIAL)
        };

        // 按类型区分保存  初始化大容器
        Set<Herb>[] herbsByType = new HashSet[Type.values().length];

        // 初始化大容器中的小容器
        for (int i = 0; i < herbsByType.length; i++) {
            herbsByType[i] = new HashSet<>();
        }

        // 将植物按类型进行分类存入容器
        for (Herb h : garden) {
            herbsByType[h.getType().ordinal()].add(h);
        }

        // 通过遍历类型获取每种类型的植物。
        for (int i = 0; i < herbsByType.length; i++) {
            System.out.printf("%s : %s%n", Herb.Type.values()[i], herbsByType[i]);
        }

    }

    /**
     * 使用 EnumMap 代替序数索引案例
     */
    @Test
    public void testEnumMap() {

        // 花园
        Herb[] garden = new Herb[]{
                new Herb("一年生植物-A", Type.ANNUAL),
                new Herb("一年生植物-B", Type.ANNUAL),
                new Herb("一年生植物-C", Type.ANNUAL),
                new Herb("二年生植物-A", Type.BIENNAL),
                new Herb("二年生植物-B", Type.BIENNAL),
                new Herb("二年生植物-C", Type.BIENNAL),
                new Herb("多年生植物-A", Type.PERENNIAL),
                new Herb("多年生植物-B", Type.PERENNIAL)
        };

        Map<Type, Set<Herb>> herbsByType = new EnumMap<>(Type.class);

        for (Type type: Type.values()){
            herbsByType.put(type, new HashSet<>());
        }

        for (Herb herb: garden){
            herbsByType.get(herb.getType()).add(herb);
        }

        System.out.println(herbsByType);

    }



}